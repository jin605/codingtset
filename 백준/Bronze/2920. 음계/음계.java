import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> music = new ArrayList<>(8);
        for(int i = 0; i < 8; i++){
            music.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> musicAsc = new ArrayList<>(music);
        musicAsc.sort(Comparator.naturalOrder());
        List<Integer> musicDesc = new ArrayList<>(music);
        musicDesc.sort(Comparator.reverseOrder());

        if (music.equals(musicAsc)){
            System.out.println("ascending");
        } else if (music.equals(musicDesc)){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
