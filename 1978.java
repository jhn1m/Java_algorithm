import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // 입력받은 값을 담을 배열 생성
    static int[] arrMade(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        return arr;
    }

    // 배열내의 값을 소수체크 함수에 대입
    static int arrChk(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNum(arr[i])) {
                cnt++;
            }
        }
        return cnt;
    }

    // 소수 체크
    static boolean isPrimeNum(int n) {
        // 1은 소수가 아니므로 제외하고 시작
        if (n > 1) {
            int cnt = 0;

            // 1부터 시작하여 자신까지 나머지 연산실행
            for (int i = 1; i <= n; i++) {
                // 소수를 찾기 위한 나머지 연산
                if (n % i == 0) {
                    cnt++;
                }
            }

            // 소수는 1과 자신으로만 나눠지므로 cnt가 2인 값을 찾음.
            if (cnt == 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // 입력받는 부분
        int n = sc.nextInt();
        int[] arr = arrMade(n);
        int result = arrChk(arr);
        System.out.println(result);
    }
}
