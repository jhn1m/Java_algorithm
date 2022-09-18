import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        double a = Integer.parseInt(arr[0]);
        double b = Integer.parseInt(arr[1]);
        double v = Integer.parseInt(arr[2]);
        int x = (int) Math.ceil((v - b) / (a - b));

        System.out.println(x);
    }
}
