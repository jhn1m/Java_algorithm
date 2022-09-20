import java.util.Scanner;

public class Main {

    static int arrPlus(int x, int[] y) {
        int result = 0;
        for (int i = 0; i < x + 1; i++) {
            result += y[i];
        }
        return result;
    }

    public static void main(String[] args) {

        // 입력받는 부분
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] answer = new int[t];

        // testcase만큼 반복 시작
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int cnt = 0;
            int[] Floor = new int[15];
            int[] temp = new int[15];

            // 0, 1은 무조건 같으므로 미리 값 넣어두기
            temp[0] = 0;
            temp[1] = 1;

            // 1층 일때 값 세팅
            for (int j = 0; j < Floor.length; j++) {
                Floor[j] = j;
            }

            // 0층 이상
            if (k > 0) {
                // 입력받은 층수 바로 밑 층 까지 배열 생성
                for (int q = 0; q < k; q++) {
                    for (int j = 0; j < Floor.length; j++) {
                        temp[j] = Floor[j];
                    }
                    for (int o = 2; o < Floor.length; o++) {
                        int stoarge = arrPlus(o, temp);
                        Floor[o] = stoarge;
                    }
                }
                answer[i] = Floor[n];
            } // 0층
            else {
                for (int j = 0; j <= n; j++) {
                    cnt += Floor[j];
                }
                answer[i] = cnt;
            }
        }
        // 답변 출력부분
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
