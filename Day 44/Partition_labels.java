class Solution {
    public List<Integer> partitionLabels(String str) { 
        List<Integer> partitions = new ArrayList<>();

        for (int i = 0 ; i< str.length(); ){
            // Get first and last index of the first character  
            int startIndex = i;
            int endIndex = str.lastIndexOf(str.charAt(startIndex));

            for(int s = startIndex + 1; s <= endIndex - 1; s++){
            // find the last  index of the any  subsquent character
            int lastIndexOfNextChar = str.lastIndexOf(str.charAt(s));

            if(lastIndexOfNextChar > endIndex){
                // update endIndex if required
                endIndex = lastIndexOfNextChar;
               }
            }
            partitions.add(endIndex - startIndex + 1);
            i =endIndex + 1;
        }
        return partitions;
    }
}
