import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a >= 0 && a <= 23) || (b >= 0 && b <= 59) || (c >= 0 && c <= 1000)) {
            b += c;
            if (b >= 60) {
                int d = b / 60;
                a += d;
                b %= 60;
                if (a >= 24) {
                    a -= 24;
                }
            }
        }
        System.out.print(a + " " + b);

    }
}
