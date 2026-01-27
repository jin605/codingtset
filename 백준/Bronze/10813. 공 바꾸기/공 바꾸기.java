import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] x = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int idx1 = Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());
            int temp = x[idx1-1];
            x[idx1-1] = x[idx2-1];
            x[idx2-1] = temp;
        }

        for (int i = 0; i < x.length ; i++) {
            System.out.printf("%d ",x[i]);
        }


    }
}
