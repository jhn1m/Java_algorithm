import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        int sal;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a > 0) && (a <= 6) || (b > 0) && (b <= 6) || (c > 0) && (c <= 6)) {
            int[] arr = { a, b, c };
            int max;
            Arrays.sort(arr);
            max = arr[arr.length - 1];

            if ((a == b) && (b == c) && (c == a)) {
                sal = 10000 + (a * 1000);
            } else if (a == b) {
                sal = 1000 + (a * 100);
            } else if (b == c) {
                sal = 1000 + (b * 100);
            } else if (c == a) {
                sal = 1000 + (c * 100);
            } else {
                sal = max * 100;
            }
            System.out.println(sal);
        }
    }
}
