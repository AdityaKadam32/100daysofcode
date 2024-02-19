class Solution {
    public boolean containsDuplicate(int[] nums) {
           // Create hashset to store integers
        Set<Integer> intSet = new HashSet<>();
    // Iterate over each element
        for (int num : nums){
   // check the value in hashset;
         if (intSet.contains(num))
             return true;
    // insert the value in hashset;
        intSet.add(num);
         }

         return false;
    
    }
}
