class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new  LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
           int curr = q.poll();

        // reach at the destionation or target value
           if(arr[curr] == 0)
           return true;

           // negative means we already visted the value
           if(arr[curr]< 0)
            continue;
            
           // traverse in both the direction
           if( curr + arr[curr]< arr.length) q.add(curr + arr[curr]);
           if(curr - arr[curr] >= 0) q.add(curr - arr[curr]);

            // mark  element vistied as make it negative
            arr[curr] = -arr[curr];
        }
        return false;   
    }
}
