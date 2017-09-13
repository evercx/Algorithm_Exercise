import Easy.TwoSum;

public class Main {

    public static void main(String[] args) {

        System.out.println("start counting primes...");
        int c = 80;

        for(int asd = 0;asd < c;asd+=1) {

            long start = System.nanoTime();

            //start
            int number = 40000;
            for (int i = 1; i <= number; i = i + 2) {
                int sqrtNumber = (int) Math.sqrt(i);
                for (int j = 2; j <= sqrtNumber; j++) {
                    if (i % j == 0) break;
                }
            }
            //end

            long end = System.nanoTime();

            double millisecond = (end - start)/10 ;
            System.out.println(millisecond);

        }
    }

    public static void compute(){
        int number = 40000;
        for (int i = 1; i <= number; i = i + 2) {
            int sqrtNumber = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrtNumber; j++) {
                if (i % j == 0) break;
            }
        }

    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
