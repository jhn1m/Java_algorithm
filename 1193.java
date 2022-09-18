import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rowCnt = 1;
        int cnt = 0;
        int arrCnt = 0;

        if (n > 1) {
            while (n >= rowCnt) {
                rowCnt += cnt;
                cnt++;
            }
            rowCnt -= cnt;
            --cnt;

            arrCnt = (n - rowCnt) - 1;
            if (cnt % 2 == 0) {
                String[] arrs = new String[cnt];
                int j = cnt;
                for (int i = 0; i < cnt; i++) {
                    arrs[i] = (i + 1) + "/" + j--;
                }
                System.out.println(arrs[arrCnt]);
            } else {
                String[] arrs = new String[cnt];
                int j = cnt;
                for (int i = 0; i < cnt; i++) {
                    arrs[i] = j-- + "/" + (i + 1);
                }
                System.out.println(arrs[arrCnt]);
            }
        } else {
            System.out.println("1/1");
        }

    }
}
