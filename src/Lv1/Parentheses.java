package Lv1;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i));
            }

            int balance = 0; //괄호 균형 확인용 변수

            for (Character c : list) {
                if(c == '('){
                    balance++; //열린 괄호 (
                } else if(c == ')'){
                    balance--; //닫힌 괄호 )
                }

                //닫힌 괄호가 열린 괄호보다 많아지면 false
                if(balance < 0){
                    return false;
                }
            }
            //모든 문자 처리 후 열린 괄호가 다 닫혔으면 true
            return balance == 0;

        }
    }
}
