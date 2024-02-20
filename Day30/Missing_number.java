class Solution {
    public int missingNumber(int[] nums) {
        int allXOR =0;

        // XOR all number in range of [0,n]
        for (int i =0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
        }

        // XOR all number in the given array
        for(int num : nums){
            allXOR = allXOR^ num;
        }
        // the missing value
        return allXOR;  
    }
}
