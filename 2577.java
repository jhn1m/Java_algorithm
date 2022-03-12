import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr;
        int intResult;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if ((a >= 100 && a < 1000) && (b >= 100 && b < 1000) && (c >= 100 && c < 1000)) {
            intResult = a * b * c;
            String strResult = String.valueOf(intResult);
            arr = strResult.split("");
            int[] arr2 = new int[10];
            Arrays.fill(arr2, 0);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("0")) {
                    arr2[0]++;
                } else if (arr[i].equals("1")) {
                    arr2[1]++;
                } else if (arr[i].equals("2")) {
                    arr2[2]++;
                } else if (arr[i].equals("3")) {
                    arr2[3]++;
                } else if (arr[i].equals("4")) {
                    arr2[4]++;
                } else if (arr[i].equals("5")) {
                    arr2[5]++;
                } else if (arr[i].equals("6")) {
                    arr2[6]++;
                } else if (arr[i].equals("7")) {
                    arr2[7]++;
                } else if (arr[i].equals("8")) {
                    arr2[8]++;
                } else if (arr[i].equals("9")) {
                    arr2[9]++;
                }
            }
            for (int i = 0; i <= 9; i++) {
                System.out.println(arr2[i]);
            }
        }
    }
}
