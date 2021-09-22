import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a >= 0 && a <= 23) && (0 <= b && b <= 59)) {
                if (b == 60) {
                    a++;
                    b = 0;
                } else if (b > 60) {
                    a++;
                    b = b - 60;
                }
                System.out.println("현재시간은 " + a + "시" + b + "분");
                break;
            } else {
                System.out.println("시간을 다시 입력해주세요..");
            }
            sc.close();
        }
    }
}
