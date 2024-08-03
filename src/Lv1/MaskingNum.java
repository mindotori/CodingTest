package Lv1;

public class MaskingNum {
    public String solution(String phone_number) {
        int len = phone_number.length();

        // 마지막 4자리를 제외한 나머지 부분을 가져옴
        String remain = phone_number.substring(0, len - 4);

        // 나머지 부분을 '*'로 대체
        String masked = remain.replaceAll(".", "*");

        // 마지막 4자리 부분을 추출
        String lastFour = phone_number.substring(len - 4);

        // '*'로 대체된 부분과 마지막 4자리 부분을 결합
        String answer = masked + lastFour;

        return answer;
    }

    public static void main(String[] args) {
        MaskingNum sol = new MaskingNum();

        // 테스트 문자열
        String phone_number = "1234567890";

        // 결과 출력
        System.out.println(sol.solution(phone_number)); // 출력: ******7890
    }
}
