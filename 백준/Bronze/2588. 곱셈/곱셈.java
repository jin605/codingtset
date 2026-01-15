import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int x = B/100;
        int y = (B-x*100)/10;
        int z = B%10;

        System.out.println(A*z);
        System.out.println(A*y);
        System.out.println(A*x);
        System.out.println(A*B);









    }
}
