package leetcode_train;

import java.util.List;

public class FindBottomLeftValue {

    private int result = 0;
    private int height = 0;

    public int findBottomLeftValue(TreeNode root) {

        int result = deepTravel(root,root.val,1);
        return result;
    }

    public int deepTravel(TreeNode node,int leftValue, int currentDepth){

        if(node == null) return leftValue;
        if( currentDepth > height){
            height = currentDepth;
            leftValue = node.val;
        }

        leftValue = deepTravel(node.left,leftValue,currentDepth+1);
        leftValue = deepTravel(node.right,leftValue,currentDepth+1);

        return leftValue;
    }



    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(4);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        root2.right.left = new TreeNode(5);
        root2.right.left.left = new TreeNode(7);

        int result = new FindBottomLeftValue().findBottomLeftValue(root);
        int result2 = new FindBottomLeftValue().findBottomLeftValue(root2);

        System.out.println(result);
        System.out.println(result2);

    }
}
