class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
        return 0;
        }
        return getSum(root,false);
    }
    public int getSum(TreeNode root, boolean isleftChild){
        if(root.left == null && root.right == null){
           return (isleftChild)? root.val:0;
        }
        int sum = 0;
        if(root.left!= null){
            sum += getSum(root.left,true);
        }
                if(root.right!= null){
            sum += getSum(root.right,false);
    }
    return sum;
  }
}
