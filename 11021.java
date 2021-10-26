import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_Num, second_Num;
        int test_CaseNum = sc.nextInt();
        int sum_Array1[] = new int[test_CaseNum];
        int sum_Array2[] = new int[test_CaseNum];

        for (int i = 1; i <= test_CaseNum; i++) {
            first_Num = sc.nextInt();
            second_Num = sc.nextInt();
            sum_Array1[i - 1] = first_Num;
            sum_Array2[i - 1] = second_Num;
        }

        for (int i = 0; i < test_CaseNum; i++) {
            System.out.println("Case #" + (i + 1) + ": " + (sum_Array1[i] + sum_Array2[i]));
        }
        sc.close();
    }
}
