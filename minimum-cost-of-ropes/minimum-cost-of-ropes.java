class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        Queue<Long> pq=new PriorityQueue<>();
        long total=0;
        for(long i:arr) pq.add(i);
        while(pq.size()>1){
            long a=pq.poll(),b=pq.poll();
            total+=(a+b);
            pq.add(a+b);
        }
        return total;
    }
}