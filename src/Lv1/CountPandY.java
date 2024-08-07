package Lv1;

public class CountPandY {
    static class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int pCount = 0;
            int yCount = 0;
            //일단 다 대문자로 변경
            s = s.toUpperCase();
            // p와 y를 갯수로 비교
            for(int i=0;i<s.length();i++){
                //char ch = s.charAt(i);
                // char 비교할땐 ''(작은따옴표)
                if(s.charAt(i)=='P'){
                    pCount++;
                } else if(s.charAt(i)=='Y'){
                    yCount++;
                }
            }
            if(pCount == yCount){
                return answer;
            } else{
                return false;
            }
        }
    }
}
