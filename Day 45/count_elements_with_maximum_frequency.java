class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frequency_array = new int[101];
        int maxFrequency = 0;
        int sumFrequency = 0;

        for( int element: nums){
            frequency_array [element]++;
            // Check  current Frequency 
           int currentFrequency  = frequency_array[element];
            // currentfrequency greater the max frequency then updated maxfrequency & sumFrequency
            if(currentFrequency > maxFrequency){
                maxFrequency = currentFrequency;
                sumFrequency = currentFrequency;
            // if currentfrequency is same as max frequency  then direct update the sum Frequency  
            }else if(currentFrequency == maxFrequency){
                sumFrequency = sumFrequency+currentFrequency;
            }
        }
        return sumFrequency; 
    }
}
