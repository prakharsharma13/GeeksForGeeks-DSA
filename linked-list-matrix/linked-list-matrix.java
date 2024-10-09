class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        if(arr.length == 0 || arr[0].length==0){
            return null;
        }
        Node [][] nodeMat  = new Node[arr.length][arr[0].length];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               nodeMat[i][j] = new Node (arr[i][j]);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                
 if (j < arr[0].length - 1) {
                 nodeMat[i][j].right = nodeMat[i][j + 1];
                }
                // Link to the down neighbor
                if (i < arr.length - 1) {
                    nodeMat[i][j].down = nodeMat[i + 1][j];
                }
            }
        }
         return nodeMat[0][0];
        
    }

