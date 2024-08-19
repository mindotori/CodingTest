package Lv0;

public class GrandmaLetter {
    public int solution(String message) {
        int answer = 0;
        for(int i=0;i<message.length();i++){
            answer = 2 * i + 2;
        }
        return answer;
    }
}
