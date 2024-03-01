class Solution {
    public int jump(int[] nums) {
        int totaljumps = 0;
        // destination in last index 
        int destination = nums.length-1;
        int  coverage = 0, lastjumpidx = 0;
   // base content case 
    if(nums.length == 1) return 0;
    // greedy apparch : exdend coverage as long as possible
    for(int i = 0; i< nums.length; i++){
         coverage = Math.max(coverage, i+nums[i]);
        if( i == lastjumpidx){
            lastjumpidx = coverage;
            totaljumps++;
        // check if we reached destination already
        if(coverage >= destination){
            return totaljumps;
          }
    }     
 }
 return totaljumps;
    }
}
