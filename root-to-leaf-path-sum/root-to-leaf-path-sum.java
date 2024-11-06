class Solution {
    public static int dfs(Node node, int val){
        if(node == null) return 0;
        
        val = val * 10 + node.data;
        if(node.left == null && node.right == null) return val;
        return dfs(node.left, val) + dfs(node.right, val);
    }
    
    public static int treePathsSum(Node root){
        return dfs(root, 0);
    }
}