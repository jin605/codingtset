import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String s = br.readLine();

        for (int i = 0; i < 26; i++){
            int position = -1;

            for (int j = 0; j < s.length(); j++){
                if (alphabet.charAt(i) == s.charAt(j)){
                    position = j;
                    break;
                }
            }
            sb.append(position).append(" ");

        }

        System.out.println(sb);











    }
}
