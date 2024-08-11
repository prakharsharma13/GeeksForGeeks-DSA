class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        
        Arrays.sort(arr, new Comparator<Job>(){
           public int compare(Job j1, Job j2) {
               return j2.profit-j1.profit;
           }
        });
        
        int count=0;
        int maxProfit=0;
        int maxDeadline=0;
        for(Job j:arr){
            maxDeadline=Math.max(maxDeadline, j.deadline);
        }
        int[] schArr=new int[maxDeadline+1];
        Arrays.fill(schArr, -1);
        
        for (Job j : arr) {
            for (int d = j.deadline; d > 0; d--) { // Start from the job's deadline and move backwards
                if (schArr[d] == -1) { // If the slot is available
                    schArr[d] = j.id;
                    maxProfit += j.profit;
                    count++;
                    break;
                }
            }
        }

        return new int[]{
            count,maxProfit
        };
    }
}