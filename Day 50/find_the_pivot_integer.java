class Solution {
    public int pivotInteger(int n) {
      int  leftSum = 0;
      int rightSum = n*(n+1)/2;
      for(int k = 1; k<=n;k++){
        leftSum += k;
        rightSum -= (k-1);
      
      if(leftSum == rightSum){
        return k;
         }
      }
      return -1;
   }
}
