package Lv1;

public class Nnum {
    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            // answer = x * n 범위에서 x의 배수 리턴
            for(int i=0;i<n;i++){
                answer[i] = (long)x * (i+1);
            }
            return answer;
        }
    }
}
