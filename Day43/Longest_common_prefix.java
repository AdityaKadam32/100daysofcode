class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        // sort the array
        Arrays.sort(strs);

        // Traverse the string from first to last 
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        //check the chararcter of the string in an array are equal
        for(int i=0; i<first.length;i++){
            if(first[i] != last[i])
                break;
                result.append(first[i]);
            }

            return result.toString();
        
    }
}
