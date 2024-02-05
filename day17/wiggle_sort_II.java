class Solution {
    private void swap(int [] nums , int left , int right){
        // basic swaping  function logic
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right]= temp;

    }
    public void wiggleSort(int[] nums) {
        // traverse the arr
        
        for(int i = 0; i< nums.length-1;i++){
            // even index
            if(i % 2==0 && nums[i]> nums[i+1]){
                swap(nums, i,i+1);
            }
            // odd index 
            if(i % 2!=0 && nums[i]< nums[i+1]){
                swap(nums, i, i+1);
            }
        }    
    }
}
