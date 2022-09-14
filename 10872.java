import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static void factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        factorial(n);
    }
}
