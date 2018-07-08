

score = [3,2,6,3,7,9,1];

for(var i =0;i < score.length - 1;i++)
{
    for(var j = 0;j <  score.length - 1-i;j++)// j开始等于0，
    {
        if(score[j] < score[j+1])
        {
            var temp = score[j];
            score[j] = score[j+1];
            score[j+1] = temp;
        }
    }
}

console.log(score);


// public class Bubble<T extends Comparable<T>> extends Sort<T> {
//     @Override
//     public void sort(T[] nums) {
//     int N = nums.length;
//     boolean hasSorted = false;
//     for (int i = 0; i < N && !hasSorted; i++) {
//         hasSorted = true;
//         for (int j = 0; j < N - i - 1; j++) {
//             if (less(nums[j + 1], nums[j])) {
//                 hasSorted = false;
//                 swap(nums, j, j + 1);
//             }
//         }
//     }
// }
// }



// public class Insertion<T extends Comparable<T>> extends Sort<T> {
//     @Override
//     public void sort(T[] nums) {
//     int N = nums.length;
//     for (int i = 1; i < N; i++)
//     for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--)
//     swap(nums, j, j - 1);
// }
// }


// public class QuickSort<T extends Comparable<T>> extends Sort<T> {
//     @Override
//     public void sort(T[] nums) {
//     shuffle(nums);
//     sort(nums, 0, nums.length - 1);
// }
//
// private void sort(T[] nums, int l, int h) {
//     if (h <= l)
//         return;
//     int j = partition(nums, l, h);
//     sort(nums, l, j - 1);
//     sort(nums, j + 1, h);
// }
//
// private void shuffle(T[] nums) {
//     List<Comparable> list = Arrays.asList(nums);
//     Collections.shuffle(list);
//     list.toArray(nums);
// }
// }


// private int partition(T[] nums, int l, int h) {
//     int i = l, j = h + 1;
//     T v = nums[l];
//     while (true) {
//         while (less(nums[++i], v) && i != h) ;
//         while (less(v, nums[--j]) && j != l) ;
//         if (i >= j)
//             break;
//         swap(nums, i, j);
//     }
//     swap(nums, l, j);
//     return j;
// }