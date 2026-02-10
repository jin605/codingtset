import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;

        for (int i = 0; i < t.length(); i ++){

            for (int j = 0; j < alphabet.length(); j ++){

                if (t.charAt(i) == alphabet.charAt(j)){

                    if (j <= 14){
                        count += (j/3)+3;
                    } else if ( j <= 18){
                        count += 8;
                    } else if (j <= 21){
                        count += 9;
                    } else {
                        count += 10;
                    }



                }
            }
        }

        System.out.println(count);












    }
}
