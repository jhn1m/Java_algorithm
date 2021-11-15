import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열에 입력받는 부분
        int[] Array = new int[9];

        for (int i = 0; i < Array.length; i++) {
            int a = sc.nextInt();
            if (a > 0 && a <= 100) {
                Array[i] = a;
            }
        }
        int[] Array2 = Array.clone();
        Arrays.sort(Array2);
        int max = Array2[8];
        System.out.println(max);

        int max_num = Arrays.binarySearch(a, key)

    }
}
