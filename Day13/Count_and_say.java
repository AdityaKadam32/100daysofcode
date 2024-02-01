class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=2;i<=n;i++){
            s =countAndAdd(s);
        }
        return s;
        
    }

    String countAndAdd(String s) {
        StringBuilder curString = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i=1; i<s.length();i++){
            if(s.charAt(i)== c){
                count++;
            }
            else {
                curString.append(count);
                curString.append(c);
                c = s.charAt(i);
                c =s.charAt(i);
                count = 1;
            }
        }
        curString.append(count);
        curString.append(c);
        return curString.toString();
    }
}
