package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res=new ArrayList<>();
    search(root,res);
    return res;

}
    public void search(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        if(root.left!=null){
            search(root.left,res);
        }
        res.add(root.val);
        if(root.right!=null){
            search(root.right,res);
        }
        return;
    }
}
