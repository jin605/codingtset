import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int sum = n;

        while(sc.hasNext()){
            String r = sc.next();
            if (!r.equals("=")){
                int c = sc.nextInt();
                if (r.equals("+")){
                    sum += c;
                }if (r.equals("-")){
                    sum -= c;
                }if (r.equals("*")){
                    sum *= c;
                }if (r.equals("/")){
                    sum /= c;
                }
            } else {
                System.out.println(sum);
            }

        }



    }
}