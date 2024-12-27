package Lv1;

public class Division {
    class Solution {
        public int solution(int left, int right) {
            int num = 0;
            for (int i = left; i <= right; i++) {
                if(countDivision(i) % 2 == 0){
                    num += i;
                } else {
                    num -= i;
                }
            }
            return num;
        }
        public int countDivision(int n){
            int count = 0;
            for (int i = 1; i * i <= n; i++) { //제곱근까지 순회
                if(n % i == 0){
                    count++; //작은 약수
                    if(i != n / i){ // i와 n / i가 같지 않으면 큰 약수도 추가
                        count++;
                    }
                }
            }
            return count;
        }
    }

}
