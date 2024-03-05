class Solution {
    public int minimumLength(String s) {
        int num = s.length();
        int preffix = 0;
        int suffix = num-1;
        while (preffix < suffix  && s.charAt(preffix) == s.charAt(suffix)){
            char ch = s.charAt(preffix);
            //del - preffix
            while(preffix<=suffix && s.charAt(preffix)==ch){
                preffix++;
            }
            //del -suffix
             while(preffix<=suffix && s.charAt(suffix)==ch){
                suffix--;
            }
            
        }  
        return (suffix-preffix+1);  
    }
}
