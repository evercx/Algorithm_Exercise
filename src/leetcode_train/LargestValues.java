package leetcode_train;
import java.util.*;
/*
*
* https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
*
* https://www.cnblogs.com/masterlibin/p/5911298.html
*
* */

public class LargestValues {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> resultList = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        if(root == null) return resultList;

        while(list.size() != 0){

            // 选出当前层中的最大值,加到结果列表里
            int currentLevelMax = Integer.MIN_VALUE;
            for( int i = 0; i < list.size();i++){
                currentLevelMax = Math.max(currentLevelMax,list.get(i).val);
            }
            resultList.add(currentLevelMax);

            List<TreeNode> tempList = new ArrayList<>();

            // 组建下一层节点的列表
            for( int i = 0; i < list.size(); i++){

                TreeNode node = list.get(i);
                if(node.left != null)  tempList.add(node.left);
                if(node.right != null)  tempList.add(node.right);

            }
            list = tempList;
        }

        return resultList;
    }



    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        List<Integer> result = new LargestValues().largestValues(root);

        System.out.println(result);

    }
}
