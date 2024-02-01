class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j= s.length-1;
        char temp='0';

        while (i<=j){
            temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;

        }

    }
}
