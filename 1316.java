import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static boolean check() {
        boolean[] alphabets = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            if (prev != now) {
                if (alphabets[now - 'a'] == false) {
                    alphabets[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int cnt = 0;
        int inputValue = sc.nextInt();

        for (int i = 0; i < inputValue; i++) {
            if (check() == true) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
