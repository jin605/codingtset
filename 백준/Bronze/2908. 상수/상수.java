import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 123
        int b = Integer.parseInt(st.nextToken());

        int targetA = 0;
        int targetB = 0;


        while (a != 0 && b != 0){

            targetA = targetA * 10 + (a % 10);
            a /= 10;

            targetB = targetB * 10 + (b % 10);
            b /= 10;

        }

        System.out.println(Math.max(targetA,targetB));








    }
}
