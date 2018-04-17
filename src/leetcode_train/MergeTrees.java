package leetcode_train;

/**
 * Created by EVERCX on 2018/4/10.
 *
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 */
public class MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null && t2 == null) return null;
        else if(t1 == null) return t2;
        else if(t2 == null) return t1;

        TreeNode newNode = new TreeNode(t1.val + t2.val);
        newNode.left = mergeTrees(t1.left,t2.left);
        newNode.right = mergeTrees(t1.right,t2.right);

        return newNode;

    }

    public static void main(String[] args) {


    }
}
