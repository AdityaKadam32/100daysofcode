class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        if(n==0) return 0;
        int score = 0;
        Arrays.sort(tokens);
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(tokens[left]<=power){
                power-=tokens[left];
                score++;
                left++;   
            }else if(left < right && score>0){
                power+=tokens[right];
                score--;
                right--;
            }else{
                return score;
            }
        }
        return score;
    
    }

}
        
    
