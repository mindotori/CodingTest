package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//자연수 뒤집어 배열로 만들기
public class Upward {
    class Solution {
        public int[] solution(long n) {
            // long n을 문자열로 변환
            String str = String.valueOf(n);
            // 문자열을 뒤집기 위해 StringBuilder 사용
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            // 결과를 저장할 int 배열 생성
            int[] answer = new int[sb.length()];
            for (int i = 0; i < sb.length(); i++) {
                // 각 문자를 숫자로 변환하여 배열에 저장
                answer[i] = sb.charAt(i) - '0';
            }

            // 배열 반환
            return answer;
        }
    }

}
