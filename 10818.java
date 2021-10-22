import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("배열의 크기 : ");
            int n = sc.nextInt();
            int[] N = new int[n];
            int min = 0;
            int max = 0;

            // 조건
            if (N.length >= 1 && N.length <= 1000000) {

                // 배열 입력받기
                for (int i = 0; i < N.length; i++) {
                    N[i] = sc.nextInt();
                }

                for (int i = n; i > 0; i--) {
                    for (int t = 0; t < N.length; t++) {
                        int j = 0;
                        if (N[t] > N[t + 1]) {
                            j = N[t];
                            N[t] = N[t + 1];
                            N[t + 1] = j;
                        }
                        min = N[0];
                    }
                }
                System.out.print(min);
            }
        } catch (Exception e) {
            System.out.print("에러 :" + e);
        }
    }
}
