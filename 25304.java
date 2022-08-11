import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, arrSum = 0;

        x = sc.nextInt();
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() * sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }

        if (arrSum == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
