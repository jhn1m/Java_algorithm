import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();
        if (subject > 0 && subject <= 1000) {
            // 시험 본 과목의 개수
            double[] arr = new double[subject];
            for (int i = 0; i < arr.length; i++) {
                // 현재 성적
                double score = (double) sc.nextInt();
                if (score >= 0 && score <= 100) {
                    arr[i] = score;
                }
                // int zeroCnt = 0;
                // for (int j = 0; j < arr.length; j++) {
                // if (arr[i] == 0) {
                // zeroCnt++;
                // }
                // }
                // if (zeroCnt > 1) {
                // System.out.println("다시 입력하시오");
                // break;
                // }
            }
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] / max * 100;
            }
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            double avg = sum / arr.length;
            System.out.println(avg);
        }
    }
}
