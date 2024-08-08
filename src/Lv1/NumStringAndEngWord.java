package Lv1;

public class NumStringAndEngWord {
    static class Solution {
        public int solution(String s) {
            // word, num 각각 배열로 설정
            String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
            String[] num = {"0","1","2","3","4","5","6","7","8","9"};
            for(int i=0;i<word.length;i++){
                // s에서 word와 일치하는 값을 num으로 바꿔치기
                s = s.replaceAll(word[i],num[i]);
            }

            return Integer.parseInt(s);
        }
    }
}
