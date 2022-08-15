import java.util.Scanner;

class Main {

    static Scanner sc = new Scanner(System.in);

    static String repeatSet(int r) {
        String str = sc.next();
        String[] strArr = str.split("");
        String strResult = "";

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < r; j++) {
                strResult += strArr[i];
            }
        }
        return strResult;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        String[] tarr = new String[t];

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            tarr[i] = repeatSet(r);
        }

        for (int i = 0; i < tarr.length; i++) {
            System.out.println(tarr[i]);
        }

    }
}
