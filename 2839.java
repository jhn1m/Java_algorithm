import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 입력받는 부분
        Scanner sc = new Scanner(System.in);

        // 3 <= n <= 5000
        int n = sc.nextInt();
        int[] arr = new int[(n / 3) + 1];

        for (int i = 0; i < arr.length; i++) {
            if ((n - (i * 3)) % 5 == 0) {
                arr[i] = i + ((n - (i * 3)) / 5);
            } else if ((n - (i * 3)) == 0) {
                arr[i] = i;
            }
        }

        int zeroChk = 0;
        for (int i = 0; i < arr.length; i++) {
            zeroChk += arr[i];
        }

        if (zeroChk == 0) {
            System.out.println(-1);
        } else {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    temp = arr[i];
                    break;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0 && arr[i] <= temp) {
                    temp = arr[i];
                }
            }

            System.out.println(temp);
        }

    }
}
