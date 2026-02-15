import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[9];
        int count = 1;
        
        score[0] = Integer.parseInt(br.readLine());
        int max = score[0];
        for (int i = 1 ; i < 9; i ++){
            score[i] = Integer.parseInt(br.readLine());
            if (max < score[i]){
                max = score[i];
                count = i+1;
            }

        }

        System.out.println(max);
        System.out.println(count);




    }
}
