class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        int ans = max - min;
        
        for ( int i =1; i < n; i++){
            int a = arr[i-1] + k;
            int b = arr[i] - k;
            if(b<0){
                continue;
            }
            max = Math.max(arr[n-1] - k, a);
            min = Math.min(arr[0] + k, b);
            
            ans = Math.min(ans,max-min);
        }
        return ans;
        
    }
}
