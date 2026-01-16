import java.io.*;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        while(true){
            String input = br.readLine();
            
            if (input == null || input.equals("0 0 0"))
                break;           
        
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken()); 
        int c = Integer.parseInt(st.nextToken());
        
        int findmax = Max(a,b,c);
        boolean isRight = false;
        
        if(findmax == a){
            if (a*a == b*b + c*c) isRight = true;
        } else if (findmax == b){
            if (b*b == a*a + c*c) isRight = true;
        } else {
            if (c*c == b*b + a*a) isRight = true;
        }
        
        if (isRight == true){
            System.out.println("right");
        } else {
            System.out.println("wrong");            
        }
         }
    }
        
       public static int Max(int a, int b, int c){
         int max = 0;
         max = a;
         if (max < b) max = b;
         if (max < c) max = c;
         return max; 
    
    }
            
        
        
    
                
             
        }   