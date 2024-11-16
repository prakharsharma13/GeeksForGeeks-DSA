class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        
        int count =0;
        int i=0;
        for(int num:arr){
            if(num==0){
                count++;
                
            }else{
                arr[i++]=num;
            }
        }
        
        while(count>0){
            arr[i++] = 0;
            count--;
        }
        
    }
}