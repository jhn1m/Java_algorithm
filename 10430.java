import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
