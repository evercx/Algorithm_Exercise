package leetcode_train;

import java.util.*;

public class FindFrequentTreeSum {
    private HashMap<Integer,Integer> hashmap = new HashMap<>();
    private int maxCount = 0;

    public int[] findFrequentTreeSum(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Iterator iter = hashmap.entrySet().iterator();

        help(root);

        for (Integer in : hashmap.keySet()){
            if(hashmap.get(in) == maxCount){
                result.add(in);
            }
        }

        int[] resArray = new int[result.size()];

        for(int i = 0; i < resArray.length;i++){
            resArray[i] = result.get(i);
        }
        return resArray;
    }

    public int help(TreeNode node){

        if(node == null) return 0;

        int left_value =  help(node.left);
        int right_value = help(node.right);

        int sum = left_value + right_value + node.val;

        int count = hashmap.getOrDefault(sum,0) + 1;
        maxCount = count > maxCount ? count:maxCount;
        hashmap.put(sum,count);

        return sum;
    }


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(-3);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(-5);

        int[] res1 = new FindFrequentTreeSum().findFrequentTreeSum(root1);
        int[] res2 = new FindFrequentTreeSum().findFrequentTreeSum(root2);

        for(int i = 0;i<res1.length;i++) System.out.print(res1[i] + " ");
        for(int i = 0;i<res2.length;i++) System.out.print(res2[i] + " ");



    }
}
