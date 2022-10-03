import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    private static void primeChk(int n) {
        int maxRange = n * 2;
        // 배열 생성 후 최솟값 세팅
        int[] arr = new int[maxRange + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        // 소수 검증
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }

            for (int j = 2 * i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        // 최솟값 세팅
        for (int i = 0; i <= n; i++) {
            arr[i] = 0;
        }

        // 출력부분
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        // 입력받는 부분
        int n = sc.nextInt();
        boolean state = true;

        while (state) {
            if (n == 0) {
                state = false;
            } else {
                primeChk(n);
                n = sc.nextInt();
            }
        }
    }
}
