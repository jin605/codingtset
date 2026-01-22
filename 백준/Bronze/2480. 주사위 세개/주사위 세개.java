import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fi = Integer.parseInt(st.nextToken());
        int se = Integer.parseInt(st.nextToken());
        int th = Integer.parseInt(st.nextToken());

        if (fi == se && se == th){
            System.out.println(10000 + fi * 1000);
        }
        else if (fi == se || se == th || fi == th){
            if (fi == se){
                System.out.println(1000 + fi * 100);
            }
            else {
                System.out.println(1000 + th *100);
            }

        } else {
                int max = fi;
                if (se > max ) max = se;
                if (th > max ) max = th;
            System.out.println(max * 100);

        }
    }


}



