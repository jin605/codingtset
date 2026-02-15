import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (h*w >= n){
                int floor,num;

                if (n%h == 0){

                    floor = h;
                    num = n / h;

                } else {
                    floor = n % h;
                    num = (n / h) + 1;
                }

                sb.append(String.format("%d%02d\n",floor,num));

            }
        }

        System.out.println(sb);
    }
}
