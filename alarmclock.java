import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt(); // 시간
            int b = sc.nextInt(); // 분
            int c, d, e, f;
            // c 총 분의 합
            // d 총 분의 합을 시간으로 치환
            // e 총 분의 합을 나머지연산하여 분으로 치환
            // f 분값에 45를 뺄 때 0 보다 작은 경우 b-45한 값
            if ((a >= 0 && a < 24) && (0 <= b && b < 60)) {
                /*
                 * if (b == 60) { a++; b = 0; } else if (b > 60) { a++; b = b - 60; }
                 * 
                 * c = (a * 60) + b; d = c / 60; e = c % 60;
                 */
                // 입력받은 값이 정확한 지 테스트 하는 출력구문
                // System.out.println("입력받은 값을 분으로 치환한 값은 " + c + " 입니다.");
                // System.out.println(c + " 를 시간으로 치환한 값은 " + d + " 입니다.");
                // System.out.println(c + " 를 분으로 치환한 값은 " + e + " 입니다.");
                // System.out.println("현재 입력받은 시간은 " + d + " 시 " + e + " 분 입니다.");
                System.out.println("최초 입력받은 시간" + a + "시" + b + "분");
                if (b - 45 < 0) {
                    f = b - 45;
                    if (a > 0) {
                        a--;
                    } else {
                        a = 23;
                    }
                    b = f + 60;
                } else {
                    b = b - 45;
                }
                System.out.print(a + "\t");
                System.out.print(b);
                break;
            } else {
                System.out.println("시간을 다시 입력해주세요..");
            }

            sc.close();
        }
    }
}
