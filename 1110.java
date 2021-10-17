import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int N1, N2, N3;
        int New_num = N;
        int cycle = 0;

        while (true) {
            N1 = New_num / 10;
            N2 = New_num % 10;
            N3 = N1 + N2;

            New_num = (N2 * 10) + (N3 % 10);
            cycle++;

            if (N == New_num)
                break;
            sc.close();

        }
        System.out.print(cycle);
    }
}
