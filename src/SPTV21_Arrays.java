import java.util.Random;

public class SPTV21_Arrays {
    public static void main(String[] args){
        System.out.println("========Демонстрация массивов========");
        int[] arr1 = new int[10];
        Random random = new Random ();
        for(int i = 0; i< arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        int sum = 0;
        int max = arr1[1];
        int min = arr1[1];
        System.out.println("[");
        for (int j : arr1) {
            System.out.printf("%2d,", j);
            sum += j;
            System.out.println();
            if (j > max) {
                max = j;
            }{
            if (j < min) {
                min = j;
                }
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println("sum = "+ sum);
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
    }
}