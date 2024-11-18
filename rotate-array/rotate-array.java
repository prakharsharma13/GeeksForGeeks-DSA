Queue<Integer> qu = new LinkedList<>();
        
        int m = d%arr.length;
        int i=0;
        while(i<m){
            qu.add(arr[i]);
            i++;
        }
        
        int j=0;
        while(i<arr.length){
            arr[j]=arr[i];
            i++;
            j++;
        }
        
        while(!qu.isEmpty()){
            arr[j] = qu.poll();
            j++;
        }