class Solution {
    // Helper class to store information of subtree
    static class BSTInfo {
        boolean isBST;
        int size;
        int minVal;
        int maxVal;
        
        BSTInfo(boolean isBST, int size, int minVal, int maxVal) {
            this.isBST = isBST;
            this.size = size;
            this.minVal = minVal;
            this.maxVal = maxVal;
        }
    }
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        if (root == null) return 0;
        BSTInfo result = largestBstHelper(root);
        return result.size;
    }
    
    // Helper function to find largest BST in subtree rooted at 'root'
    static BSTInfo largestBstHelper(Node root) {
        // Base case when root is null
        if (root == null) {
            return new BSTInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        // Recursively traverse left and right subtrees
        BSTInfo leftInfo = largestBstHelper(root.left);
        BSTInfo rightInfo = largestBstHelper(root.right);
        
        // Initialize current subtree information
        BSTInfo current = new BSTInfo(false, 0, 0, 0);
        
        // Check if left and right subtrees are BST and root's key is greater than max of left and smaller than min of right
        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.maxVal && root.data < rightInfo.minVal) {
            current.isBST = true;
            current.size = 1 + leftInfo.size + rightInfo.size;
            current.minVal = Math.min(root.data, leftInfo.minVal);
            current.maxVal = Math.max(root.data, rightInfo.maxVal);
        } else {
            current.size = Math.max(leftInfo.size, rightInfo.size);
        }
        
        return current;
    }
}