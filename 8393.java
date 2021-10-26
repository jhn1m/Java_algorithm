import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_CaseNum = sc.nextInt();
        int sum_All = 0;
        for (int i = 1; i <= test_CaseNum; i++) {
            sum_All += i; 
        }
        System.out.println(sum_All);
        sc.close();
    }
}
