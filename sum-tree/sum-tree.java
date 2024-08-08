class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        return ((sum(root.left) + sum(root.right)) == root.data);
    }
    private int sum(Node root) {
        return (root == null) ? 0 : sum(root.left) + sum(root.right) + root.data;
    }
}