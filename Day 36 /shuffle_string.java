class Solution {
    public String restoreString(String s, int[] indices) {
        // character array to form final string
        char [] str = new char[s.length()];

        for (int i =0; i<s.length(); i++){
            str[indices[i]] = s.charAt(i);
        }

        // Return the restored string
            return String.valueOf(str);

        
    }
}
