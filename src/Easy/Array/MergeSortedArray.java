package Easy.Array;

/**
 * Created by EVERCX on 2017/8/15.
 *
 *
 * https://leetcode.com/problems/merge-sorted-array/description/
 */
public class MergeSortedArray {

    //从后往前依次比较大小

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int totalNumber = m + n - 1;
        m--;n--;

        while(m >= 0 && n >=0){
            nums1[totalNumber--] = nums1[m] > nums2[n] ? nums1[m--]:nums2[n--];
        }

        while(n >= 0) nums1[totalNumber--] = nums2[n--];

    }
}
