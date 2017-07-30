import Easy.TwoSum;

public class Main {

    public static void main(String[] args) {

        //1.Two Sum
        TwoSum ts = new TwoSum();
        int[] a = {3,3,5};
        int[] res = ts.twoSum(a,6);

        //System.out.println(res);
        printArray(res);


    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
