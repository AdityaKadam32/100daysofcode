class Solution {
    public int numSubarraysWithSumAtMostK(int[] nums, int goal) {
        int sum = 0; 
        int start = 0;
        int count = 0;
        int n = nums.length;

        for(int end = 0; end<n; end++){
            // expansion
            sum += nums[end];
            // shrinking
            while(start <= end && sum > goal){
                sum -= nums[start];
                start++;            
                }
                count += (end-start+1);
        }
        return count;  
    }
        public int numSubarraysWithSum(int[] nums, int goal) {
            return numSubarraysWithSumAtMostK (nums,goal)-numSubarraysWithSumAtMostK(nums,goal-1);
   
    }
}
