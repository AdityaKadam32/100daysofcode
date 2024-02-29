class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length-1;

        // start with the second last index;
        for(int idx = nums.length-2; idx >= 0; idx--){

            // If you can reach the final position by this index
            // Update the final Postion
            if(idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }
        // If we reach the first index, then we can 
        // make the jump possible and return true;
        return finalPosition == 0;
        
    }
}
