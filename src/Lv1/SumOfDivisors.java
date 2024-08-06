package Lv1;

public class SumOfDivisors {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            //i=0으로 하면 연산오류남
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    answer += i;
                }
            }
            return answer;
        }
    }
}
