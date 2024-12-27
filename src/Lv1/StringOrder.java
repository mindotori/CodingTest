package Lv1;

import java.util.Arrays;

public class StringOrder {
    class Solution {
        public String solution(String s) {
            String answer = "";
            char[] arr = s.toCharArray(); //문자 배열

            Arrays.sort(arr);

           StringBuilder sb = new StringBuilder(new String(arr)); //문자 배열 String타입으로 변환
           return sb.reverse().toString(); // 내림차순
        }
    }
}
