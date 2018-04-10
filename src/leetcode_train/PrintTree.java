package leetcode_train;
import java.util.*;
import java.math.*;

/**
 * Created by EVERCX on 2018/3/28.
 *
 * https://leetcode-cn.com/problems/print-binary-tree/description/
 */



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class PrintTree {

    public List<List<String>> printTree(TreeNode root) {

        int maxDeep = maxDeep(root);
        int n  = (int)Math.pow(2,maxDeep) - 1;  //二维数组的列数

        List<List<String>> result = new ArrayList<List<String>>();

        for(int i=0;i < maxDeep;i++){
            List<String> curList = new ArrayList<String>();
            for(int j = 0;j < n; j++){
                curList.add("");
            }

            result.add(curList);
        }

        setNodesToList(result,root,0,0,n);
        return result;
    }

    public void setNodesToList(List<List<String>> result,TreeNode node,int listLevel,int leftIndex,int rightIndex){

        if(node == null) return;

        int index = (leftIndex + rightIndex) / 2;

        result.get(listLevel).set(index,node.val+"");

        setNodesToList(result,node.left,listLevel+1,leftIndex,index-1);

        setNodesToList(result,node.right,listLevel+1,index+1,rightIndex);

    }

    public int maxDeep(TreeNode root){
        if(root == null) return 0;
        int leftDeep =  maxDeep(root.left);
        int rightDeep = maxDeep(root.right);

        return (leftDeep > rightDeep ? leftDeep:rightDeep) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);

        List<List<String>> result = new PrintTree().printTree(root);

        List<String> r = new ArrayList<>();

        r.add("1");
        r.add("");
        r.add(0,"");

        System.out.println(result.toString());
        System.out.println(new PrintTree().printTree(root));

    }
}
