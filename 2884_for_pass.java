import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시간
        int b = sc.nextInt(); // 분
        int c;
        if ((a >= 0 && a < 24) && (0 <= b && b < 60)) {
            if (b - 45 < 0) {
                c = b - 45;
                if (a > 0) {
                    a--;
                } else {
                    a = 23;
                }
                b = c + 60;
            } else {
                b = b - 45;
            }

        }
        sc.close();
        System.out.print(a + " " + b);
    }
}
