package leetcode_train;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EVERCX on 2018/4/10.
 *
 * https://leetcode-cn.com/problems/maximum-binary-tree/description/
 */



//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}


public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return createMaxRoot(0,nums.length,nums);

    }

    public TreeNode createMaxRoot(int startIndex,int endIndex,int[] nums){

        int maxNodeValue = Integer.MIN_VALUE;
        int maxNodeValueIndex = -1;

        if (startIndex == endIndex) return null;

        for(int i = startIndex;i < endIndex;i++){

            if (maxNodeValue <= nums[i]){
                maxNodeValue = nums[i];
                maxNodeValueIndex = i;
            }
        }

        TreeNode rootNode = new TreeNode(maxNodeValue);
        rootNode.left = createMaxRoot(startIndex,maxNodeValueIndex,nums);
        rootNode.right = createMaxRoot(maxNodeValueIndex+1,endIndex,nums);

        return rootNode;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        TreeNode result = new ConstructMaximumBinaryTree().constructMaximumBinaryTree(nums);
        System.out.print(result.val);

    }
}
