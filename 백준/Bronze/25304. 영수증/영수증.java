import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalSum = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        int sum = 0;

        while(count > 0){
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int no = Integer.parseInt(st.nextToken());
            sum += price * no;
            count--;
        }

        if (totalSum == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }
}
