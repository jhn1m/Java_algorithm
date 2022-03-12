import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a <= 1000 && a > 0) {
                arr[i] = a;
            }
        }
        sc.close();

        for (int i = 0; i < 10; i++) {
            arr[i] %= 42;
        }
        Arrays.sort(arr);

        int cnt2 = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] != arr[i + 1]) {
                cnt2++;
            }
        }
        System.out.println(cnt2 + 1);
    }
}
