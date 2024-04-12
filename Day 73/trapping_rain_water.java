class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0;
        int rightMax=0;
        int left=0;
        int right = n-1;
        int ans = 0;
        while(left < right){
            if(height[left]>leftMax){
                leftMax = Math.max(leftMax,height[left]);
            }
            if(height[right]>rightMax){
                rightMax = Math.max(rightMax, height[right]);
            }
            if(leftMax < rightMax){
                ans = ans + leftMax - height[left];
                left++;
            }else{
                ans = ans + rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
