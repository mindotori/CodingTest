package Lv1;

public class CollatzConjecture {
    static class Solution {
        public int solution(long num) { // int가 아니라 long이여야함
            int answer = 0;

            while(num!=1){
                if(num%2==0){
                    num = num/2;
                } else {
                    num = num * 3 + 1;
                }
                answer++;
                //반복 횟수가 500초과면 -1 반환
                if(answer>500){
                    return -1;
                }
            }
            return answer;
        }
    }
}
