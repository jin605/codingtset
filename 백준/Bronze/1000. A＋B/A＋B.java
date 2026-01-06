import java.util.Scanner;

public class Main { // 클래스 이름을 반드시 Main으로 변경
    public static void main(String[] args) { // public 키워드 추가
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A + B);

        in.close();
    }
}