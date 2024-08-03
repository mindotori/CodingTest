package Lv1;
import java.util.Arrays;
public class FindKim {
    public String solution(String[] seoul) {
        // "Kim"의 위치 찾기
        int index = Arrays.asList(seoul).indexOf("Kim");

        // 리턴 문자열 형식
        String result = "김서방은 " + index + "에 있다";

        // 결과 반환
        return result;
    }

    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(kim.solution(seoul));  // 출력: 김서방은 1에 있다

    }
}

