class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int [] [] dp = new int [nums1.length+1] [nums2.length+2];

        int max = 0;
        // intializing the numbers in an array
        for(int i = 1; i<= nums1.length; i++)
        for(int j = 1; j<= nums2.length; j++)

        // check the numbers are equal
        if(nums1[i-1] == nums2[j-1]){
        // add number diagonaly
         dp [i][j] = dp[i-1][j-1]+1;
         max = Math.max(max, dp[i][j]);

        }
        return max;   
    }
}
