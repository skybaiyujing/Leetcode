package BinaryTree;
/*
* 求二叉树直径 leetcode543
*分别求每个节点左右的深度，返回深度最大的那条加1
*
*
* */
public class diameterOfBinaryTree {
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        deepSeek(root);
        return max;

    }
    public int deepSeek(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=deepSeek(root.left);
        int right=deepSeek(root.right);
        int num=left+right;
        max=num>max?num:max;
        return Math.max(left,right)+1;
    }
}
