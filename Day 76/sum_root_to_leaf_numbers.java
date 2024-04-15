class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        getPathSum(root,0);
        return sum;
    }
    public void getPathSum(TreeNode root, int curNum){
        if(root == null){
            return;
        }
        //curent node
        // form the num
        curNum = curNum*10 + root.val;//100
        if(root.left==null && root.right ==null){
            sum+=curNum;
            return;
        }
        //left call
        getPathSum(root.left,curNum);
    
        // right call
        getPathSum(root.right,curNum);
    }
}
