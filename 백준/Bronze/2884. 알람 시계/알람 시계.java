import java.io.*;
import java.util.StringTokenizer;

public class Main{

public static void main(String[] args) throws IOException{

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    int totalmin = h * 60 + m - 45; 
    
    if (totalmin < 0){

totalmin += 24*60;}
    

    
    h = totalmin/60;
    m = totalmin%60;
    
    System.out.println(h + " " + m);
        
}
        
    
    
        







}