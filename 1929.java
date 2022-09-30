import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 입력받는 부분
        int m = sc.nextInt();
        int n = sc.nextInt();

        // 배열 생성 후 최솟값 세팅
        int[] arr = new int[n + 1];
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
        for (int i = 0; i < m; i++) {
            arr[i] = 0;
        }

        // 출력부분
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + "\n");
            }
        }
    }
}
