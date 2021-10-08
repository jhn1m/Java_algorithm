import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, X, C;
        N = sc.nextInt();
        X = sc.nextInt();
        if (N >= 1 && X <= 10000) {
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                C = sc.nextInt();
                if (C < X) {
                    A[i] = C;
                }
            }
            for (int i = 0; i < A.length; i++) {
                if (A[i] != 0) {
                    System.out.print(A[i]);
                    System.out.print(" ");
                } else {
                    System.out.print("");
                }
            }
        }
        sc.close();
    }
}
