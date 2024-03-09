class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }
    private String getActual(String input){
    StringBuilder  actualString = new StringBuilder();
    int hashCount = 0;

    for(int i = input.length()-1; i >= 0; i--) {
    
        // keep count of the character
        if(input.charAt(i) == '#'){
            hashCount++;
            continue;
        }
        // if the count>0 reduce it or skip the character
        if(hashCount > 0) {
            hashCount--;
        }
        else{
            // if no backspace, insert the character at the beginning
            actualString.insert(0,input.charAt(i));
        }
    }
     return actualString.toString();    
    }
}
