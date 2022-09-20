import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];

        for (int i = 0; i < t; i++) {

            String[] arr = br.readLine().split(" ");
            int h = Integer.parseInt(arr[0]);
            int w = Integer.parseInt(arr[1]);
            int n = Integer.parseInt(arr[2]);

            if (!(h >= 1 && w <= 99 && n >= 1 && n <= (h * w))) {
                continue;
            }

            String[] rooms = new String[h * w];
            int roomCnt = 0;
            while (roomCnt < rooms.length) {
                for (int width = 0; width < w; width++) {
                    String roomWidth = "";
                    if (width < 9) {
                        roomWidth = "0" + String.valueOf(width + 1);
                    } else {
                        roomWidth = String.valueOf(width + 1);
                    }
                    for (int heigth = 0; heigth < h; heigth++) {
                        String roomHeight = String.valueOf(heigth + 1);
                        rooms[roomCnt] = roomHeight + roomWidth;
                        ++roomCnt;
                    }
                }
            }
            result[i] = Integer.parseInt(rooms[n - 1]);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
