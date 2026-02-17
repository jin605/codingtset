import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if ((h*w) >= n){

                if (n % h == 0){
                    sb.append(h).append(String.format("%02d",(n/h))).append("\n");
                } else {
                    sb.append(n % h).append(String.format("%02d",(n/h)+1)).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
