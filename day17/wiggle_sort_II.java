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

// wiggle sort with order(n) time complexity
class Solution {
    public void wiggleSort(int[] nums) {
        //0 <= nums[i] <= 5000
        //min = 0, max = 5000
        //fill max available value on even positions then on odd positions
        
        int[] bucket = new int[5001];
        
        for(int i: nums)
            bucket[i]++;
        
        int max = 5000;
        boolean firstPass = true;
        for(int i = 1 ; i < nums.length; i+=2){
            
            
            while(bucket[max] == 0)
                max--;
            
            nums[i] = max;
            bucket[max]--;
            
            
            if(firstPass && i+2 >= nums.length){
                i = -2; // want to set i = 0 but since at the end it does i+2 so making it i = -2 to get resultant = 0
                firstPass = false;
            }
        }
        
    }
}
