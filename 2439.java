import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopNum = sc.nextInt();

        for (int i = 1; i <= loopNum; i++) {
            for (int j = loopNum; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        sc.close();
    }
}
