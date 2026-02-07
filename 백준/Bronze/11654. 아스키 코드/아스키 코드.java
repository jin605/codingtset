import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int A = Integer.parseInt(br.readLine());
        String A = br.readLine();
        int ascii = A.charAt(0);

        System.out.println(ascii);

    }

}
