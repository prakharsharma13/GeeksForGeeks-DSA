class Solution {
    // Function to check if a node is a half node
    public boolean isHalfNode(Node root) {
        return (root.left == null && root.right != null) || (root.left != null && root.right == null);
    }
    
    // Function to remove half nodes
    public Node RemoveHalfNodes(Node root) {
        if (root == null) {
            return null;
        }
        
        // Recursively remove half nodes from left and right subtrees
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);
        
        // If the current node is a half node, return its non-null child
        if (root.left == null && root.right != null) {
            return root.right;
        } else if (root.right == null && root.left != null) {
            return root.left;
        }
        
        // If the current node is not a half node, return it
        return root;
    }
    
    // Function for inorder traversal
    public void inorderTraversal(Node root) {
        inorderHelper(root);
        System.out.println();
    }
    
    private void inorderHelper(Node node) {
        if (node == null) {
            return;
        }
        
        // Traverse the left subtree
        inorderHelper(node.left);
        
        // Visit the node
        System.out.print(node.data + " ");
        
        // Traverse the right subtree
        inorderHelper(node.right);
    }
   
}