package Lv1;

public class AddNotExistedNum {
    //for문 각자 쓰기
    static class Solution {
        public int solution(int[] numbers) {
            int sum = 0;
            int numSum = 0;
            // 0부터 9까지를 합한 수 - number원소 합
            for(int j=0;j<10;j++){
                numSum += j;
            }
            for(int i=0;i<numbers.length;i++){
                sum += numbers[i];
            }
            return numSum - sum;
        }
    }

    //2중 for문 사용
    static class Solution2 {
        public int solution(int[] numbers) {
            int sum = 0;
            int numSum = 0;

            // 0부터 9까지의 합과 numbers 배열의 합을 2중 루프로 계산
            for (int i = 0; i < 10; i++) {
                numSum += i; // 0부터 9까지의 합 계산
                if (i < numbers.length) {
                    for (int j = i; j < numbers.length; j++) {
                        sum += numbers[j];
                        break; // inner 루프를 즉시 종료하여 sum 계산
                    }
                }
            }
            return numSum - sum;
        }
    }

}
