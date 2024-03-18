class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n==1) return 1;
        // sorting
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int a1[], int a2[]){
                if(a1[0]==a2[0]) return 0;
                if(a1[0]< a2[0]) return -1;
                return 1;
            }
        });
        int arrows=1;
        int commonInterval[] = points[0];
        for(int i=1;i<n;i++){
        int curS = points[i][0];
        int curE = points[i][1];

        // if intervals are overlapping then we can use existing arrow to burst it
        if(curS <=commonInterval[1]){
            commonInterval[0] = Math.max(commonInterval[0], curS);
            commonInterval[1] = Math.min(commonInterval[1],curE);
        }
        else{
            //start a mew interval
            commonInterval[0] = curS;
            commonInterval[1] = curE;
            arrows++;
        }   
    }
    return arrows;
  }
}
