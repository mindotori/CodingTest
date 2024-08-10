package Lv0;

public class Pizza {
    static class Solution {
        public int solution(int n) {
            // n을 7로 나눈 몫을 계산
            int pizzas = n / 7;

            // 나머지가 있으면 피자 한 판을 더 추가
            if (n % 7 != 0) {
                pizzas += 1;
            }

            return pizzas;
        }
    }

}
