class Solution {
    public String reversePrefix(String word, char ch) {
    char res[] = word.toCharArray();
    int left = 0;
        for(int right=0; right<word.length(); right++){
            char currentChar = res[right];
            if(currentChar == ch){
                while(left<right){
                    char temp = res[right];
                    res[right] = res[left];
                    res[left] = temp;
                    left++;
                    right--; 
                }
                return new String(res);

            }
        }
        return word;
    }
}
