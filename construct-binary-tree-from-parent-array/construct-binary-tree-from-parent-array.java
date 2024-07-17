class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
          Node root = null;
          int N = parent.length;
        
        HashMap<Integer, Node> map = new HashMap<Integer, Node>();
        
        for(int i = 0; i < N; i++){
            
            Node node = new Node(i);
            
            map.put(i, node);
        }
        
        for(int i = 0; i < N; i++){
            
            int parentNode = parent[i];
            
            if(parentNode == -1){
             root = map.get(i);
             continue;
                
            }
            
            Node pNode = map.get(parentNode);
            
            if(pNode.left == null)
             pNode.left = map.get(i);
            else
             pNode.right = map.get(i);
             
             
        }
        
        return root;
    }
}