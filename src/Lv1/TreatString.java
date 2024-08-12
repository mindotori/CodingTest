package Lv1;
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
//예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

//s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.


public class TreatString {
        public boolean solution(String s) {
            boolean answer = true;
            if(s.length()!=4&&s.length()!=6){
                //문자열 s의 길이가 4 혹은 6 (또는의 의미가아니라 &&)
                return false;
            }
            for(int i=0;i<s.length();i++){
                // 0부터 9까지의 숫자로 이루어져 있음 - 숫자지만 문자열 내부니까 char임
                if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                    //0보다 작거나 9보다 크면 false반환
                    return false;
                }
            }
            answer = true;
            return answer;
        }

}
