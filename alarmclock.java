import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt(); // 시간
            int b = sc.nextInt(); // 분
            int c, d, e; // 시간을 분으로 치환
            if ((a >= 0 && a <= 23) && (0 <= b && b <= 59)) {
                if (b == 60) {
                    a++;
                    b = 0;
                } else if (b > 60) {
                    a++;
                    b = b - 60;
                }
                c = (a * 60) + b; // 총 분의 합
                d = c / 60;
                e = c % 60;
                System.out.println("입력받은 값을 분으로 치환한 값은 " + c + " 입니다.");
                System.out.println(c + " 를 시간으로 치환한 값은 " + d + " 입니다.");
                System.out.println(c + " 를 분으로 치환한 값은 " + e + " 입니다.");
                break;
            } else {
                System.out.println("시간을 다시 입력해주세요..");
            }

            b = b - 45;
            if (b < 0) {
                a--;
                b = b + 60;
            }
            sc.close();
        }
    }
}
