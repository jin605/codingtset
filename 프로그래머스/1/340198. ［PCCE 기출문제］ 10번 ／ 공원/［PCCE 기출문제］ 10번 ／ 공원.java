import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        Arrays.sort(mats);
        
        for (int i = mats.length -1; i >= 0; i--){
            int size = mats[i];
                
                for (int r = 0; r <= park.length - size; r++){
                    for (int c = 0; c <= park[0].length - size; c++){
                        
                        if (canPlace(park,r,c,size)){
                            answer = size;
                            return answer;
                        }
                    }
                }
            
        }
        
        return -1;
    }
    
    public boolean canPlace(String[][] park, int r, int c, int size){
        for(int i = r; i < r + size; i++){
            for(int j = c; j < c + size; j++){
                if (!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        
        return true;
            
    }
    
}