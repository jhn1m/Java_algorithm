import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] honeyComb = new int[100000];
        int temp = 1;
        for (int i = 0; i < 100000; i++) {
            temp = temp + (6 * i);
            honeyComb[i] = temp;
        }

        for (int i = 0; i < honeyComb.length; i++) {
            if (n <= honeyComb[i]) {
                System.out.println(i + 1);
                break;
            }
        }

    }
}
