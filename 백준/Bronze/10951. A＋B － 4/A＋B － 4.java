import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null) {
            if (input.trim().isEmpty()) break;

        StringTokenizer st = new StringTokenizer(input);
        if (st.hasMoreTokens()) {
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append('\n');
        }
    }


        System.out.println(sb);
    }
}