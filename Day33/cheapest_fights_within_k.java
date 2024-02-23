class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
      // BST
        // adj map
        HashMap<Integer,List<int[]>> adjMap = new HashMap<>();
        // fill the adj map
        for(int i[] : flights){
            // i[0] -  from soruce --> [[to,price],...]
            // i[1] - to
            // i[2] - price
            if(!adjMap.containsKey(i[0])){
                adjMap.put(i[0], new ArrayList<>());
            }
            adjMap.get(i[0]).add(new int[]{i[1], i[2]});
        }
        int priceArray[] = new int[n];
        Arrays.fill(priceArray,Integer.MAX_VALUE);
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0});
        int stops = 0;
        while(!queue.isEmpty() && stops<=k) {
            int len = queue.size(); // level wise traversal
            while(len>0){
                int temp[] = queue.poll();
                int node = temp[0];
                int price = temp[1];
                if(!adjMap.containsKey(node)){
                    len--;
                    continue;
                }
                for(int neighbours[] : adjMap.get(node)){
                    int toNode = neighbours[0];
                    int toNodePrice = neighbours[1];
                    if(price + toNodePrice >= priceArray[toNode]){
                        continue;
                    }
                    priceArray[toNode]= price + toNodePrice;
                    queue.offer(new int[]{toNode, priceArray[toNode]});
                }
                len--;

            }
            stops++; // stops will increase at each level
        }
        return (priceArray[dst] == Integer.MAX_VALUE?-1: priceArray[dst]);
        
    }
}
