class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        /*
        1- convert edges into map
        2- create empty array  of size n filled with -1
        3- run bfs and put level of element into array
        4- return array
        */
        
        int ans[]=new int[n];
        boolean visit[]=new boolean[n];
        Arrays.fill(ans,-1);
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i[]:edges){
            int u=i[0],v=i[1];
            map.computeIfAbsent(u,k->new ArrayList<>()).add(v);
            map.computeIfAbsent(v,k->new ArrayList<>()).add(u);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        visit[src]=true;
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int rt=q.poll();
                ans[rt]=level;
                if(map.containsKey(rt)){    
                    for(int j:map.get(rt)){
                        if(!visit[j]){
                            q.add(j);
                             visit[j]=true;
                        }
                    }
                }
            }
            level++;
        }
        return ans;
        
    }
}