import java.util.Scanner;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4]; 
    static int MAX = Integer.MIN_VALUE;  
    static int MIN = Integer.MAX_VALUE;  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

 
        dfs(numbers[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int num, int idx) {
        if (idx == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                
                operators[i]--;

                if (i == 0) { // 더하기
                    dfs(num + numbers[idx], idx + 1);
                } else if (i == 1) { // 빼기
                    dfs(num - numbers[idx], idx + 1);
                } else if (i == 2) { // 곱하기
                    dfs(num * numbers[idx], idx + 1);
                } else if (i == 3) { // 나누기
                    dfs(num / numbers[idx], idx + 1);
                }

      
                operators[i]++;
            }
        }
    }
}