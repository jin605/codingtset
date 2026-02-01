import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (x[i] == v){
                count ++;
            }

        }

        System.out.println(count);




    }
}
