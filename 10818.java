import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];

        if (N.length >= 1 && N.length <= 1000000) {
            for (int i = 0; i < N.length; i++) {
                N[i] = sc.nextInt();
            }
            Arrays.sort(N);

            System.out.print(N[0] + " ");
            System.out.print(N[N.length - 1] + " ");
        /*
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("배열의 크기 : ");
            int n = sc.nextInt();
            int[] N = new int[n];
            int min = 0;
            int max = 0;

            // 조건
            if (N.length >= 1 && N.length <= 1000000) {

                // 배열 입력받기
                for (int i = 0; i < N.length; i++) {
                    N[i] = sc.nextInt();
                }

                for (int i = n; i > 0; i--) {
                    for (int t = 0; t < N.length; t++) {
                        int j = 0;
                        if (N[t] > N[t + 1]) {
                            j = N[t];
                            N[t] = N[t + 1];
                            N[t + 1] = j;
                        }
                        min = N[0];
                    }
                }
                System.out.print(min);
            }
        } catch (Exception e) {
            System.out.print("에러 :" + e);
        }
        */
    }
}

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st;
        // int ArrayNum = Integer.parseInt(br.readLine());
        // int[] list = new int[ArrayNum];
        // int i, k, j, temp;
        // st = new StringTokenizer(br.readLine());
        // for (i = 0; i < st.countTokens(); i++) {
        // list[i] = Integer.parseInt(st.nextToken());
        // }
        // for (k = ArrayNum - 1; k > 0; k--) {
        // for (j = 0; j < k; j++) {
        // if (list[j] > list[j + 1]) {
        // temp = list[j];
        // list[j] = list[j + 1];
        // list[j + 1] = temp;
        // }

        // }

        // }
        // int min = list[0];
        // int max = list[ArrayNum];
        // System.out.print(min + " ");
        // System.out.print(max);
