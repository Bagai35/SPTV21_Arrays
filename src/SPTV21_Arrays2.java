import java.util.Random;

public class SPTV21_Arrays2 {
    public static void main(String[] args) {
        System.out.println("========Демонстрация массивов========");
        int[] arr1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
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
            }
            {
                if (j < min) {
                    min = j;
                }
            }
        }
        System.out.println("]");
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("========Демонстрация массивов[] []========");
        int arr2[][] = new int[10][10];
        int sum1 = 0;


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(100);
                if (min > arr2[i][j]) min = arr2[i][j];
                if (max < arr2[i][j]) max = arr2[i][j];
                sum1 += arr2[i][j];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%4d", arr2[i][j]);

            }
            System.out.println();
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("summ = " + sum1);

    }
}

