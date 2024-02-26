class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Get Sum for starting window
        int sum = 0;
        for(int i = 0; i< k; i ++)
        sum += nums[i];

        int maxSum = sum;

        // started the sliding window
        int startIndex = 0;
        int endIndex = k;
        while (endIndex < nums.length){

            sum -= nums[startIndex]; //delete the start element
            startIndex++;

            sum += nums [endIndex];
            // add the end element
            endIndex++;
            maxSum = Math.max(maxSum, sum); // update the Maxsum
        }
     // return the average
    return (double) maxSum/k;
}
}
