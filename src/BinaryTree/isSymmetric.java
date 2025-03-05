package BinaryTree;

public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return iterateSymmetric(root.left,root.right);
    }
    public boolean iterateSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if((left!=null&&right==null)||(left==null&&right!=null)){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        boolean a=iterateSymmetric(left.left,right.right);
        boolean b=iterateSymmetric(left.right,right.left);
        if(a==true&&b==true){
            return true;
        }
        return false;
    }

}
