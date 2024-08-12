package Lv1;

public class EachIndexPlus {
    public int solution(int n) {
        int answer = 0;
        String nn = Integer.toString(n);
        for(int i=0;i<nn.length();i++){
            // Character.getNumericValue(char) = char을 int로 형변환
            answer += Character.getNumericValue(nn.charAt(i));
        }

        return answer;
    }
}
