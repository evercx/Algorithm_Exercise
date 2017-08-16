package Easy.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

/**
 * Created by EVERCX on 2017/8/16.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }
        }

        for(int i = 0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0;i < list.size();i++){
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {

        Intersection it = new Intersection();

        int[] nums1= new int[] {2,1};
        int[] nums2= new int[] {1,2};

        it.intersection(nums1,nums2);

    }
}
