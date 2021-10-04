import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, e, f;
        
        a = sc.nextInt();
        b = sc.nextInt();            
        
        c = a * (b % 100 % 10);
        System.out.println(c);
        
        d = a * (b % 100 / 10);
        System.out.println(d);
        d = d * 10;
        
        e = a * (b / 100);
        System.out.println(e);
        e = e * 100;
        
        f = c + d + e;
        System.out.println(f);
        
        sc.close();
    }
}
