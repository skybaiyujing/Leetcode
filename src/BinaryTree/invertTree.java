package BinaryTree;

public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){return null;}
        TreeNode left=root.left==null?null:root.left;
        TreeNode right=root.right==null?null:root.right;
        invertTree(left);
        invertTree(right);
        root.left=right;
        root.right=left;
        return root;
    }
}
