class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = n/10;
        n = n * 12000;
        k = (k-free) * 2000; 
        answer = n + k;
        

        
        return answer;
    }
}