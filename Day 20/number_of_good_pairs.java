class Solution {
    public int numIdenticalPairs(int[] nums) {
        //calculate the frequency of each number
        int[] count = new int [102];

        for (int num : nums) {
            count[num]++;
        }

        int totalCount = 0;

        // calculate total number of pairs possible
        for(int i : count) {
            totalCount += ((i) * (i-1))/2;
        }
        return totalCount;  
    }
}
