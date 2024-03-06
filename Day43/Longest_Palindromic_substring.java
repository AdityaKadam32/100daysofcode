class Solution {
    public String longestPalindrome(String str) {
        if(str.length() <= 1)
            return str;
        
        String LPS = "";

        for(int i = 1 ; i< str.length();i++){
        //consider // odd length
        int  low = i;
        int high = i;
        while(str.charAt(low)==str.charAt(high)){
            low--;
            high++;
        //  terminate the string value if it reachs end/start
            if(low == -1 || high == str.length()){
                break;
            }
        }
        String palindrom = str.substring(low+1,high);
        if( palindrom.length()>=LPS.length()){
            LPS = palindrom;
        }
          //consider // even length
        low = i-1;
        high = i;
        while (str.charAt(low)==str.charAt(high)){
            low--;
            high++;
        //  terminate the string value if it reachs end/start
            if(low == -1 || high == str.length()){
                break;
            }
        }
        palindrom = str.substring(low+1,high);
        if( palindrom.length()>=LPS.length()){
            LPS = palindrom;
        }
  
    }
     return LPS;
}
}
