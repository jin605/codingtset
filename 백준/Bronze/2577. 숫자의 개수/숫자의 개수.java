import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int[] count = new int[10];
        String sum = String.valueOf(a*b*c);

        for (int i = 0; i < sum.length(); i ++){
            count[sum.charAt(i)-'0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i ++){
                sb.append(count[i]).append("\n");
        }

        System.out.println(sb);


    }
}
