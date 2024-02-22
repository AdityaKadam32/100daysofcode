class Solution {
    public int findJudge(int n, int[][] trust) {
    int len = trust.length; // edges
    if (len < n-1){
        return -1;
    }
    int inDegree[] = new int[n+1];
    int outDegree[] = new int [n+1];

    for(int i = 0; i< len;i ++){
        inDegree[trust[i][1]]++; // for inDegree
        outDegree[trust[i][0]]++; // for outDegree
    }
    for ( int i =1; i<= n; i++) {
        if(outDegree[i]==0 && inDegree[i]== n-1){

        return i;
        }
    }
    return -1;
}   
}
