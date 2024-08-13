package Lv1;

public class LeapYear {
    public String solution(int a, int b) {
        String answer = "";
        // 모듈러 연산
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        // 윤년 2.29
        // 1~12월
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for(int i=1;i<a;i++){
            //a월까지 일수 누적합
            sum += month[i];
        }
        // -1을 해주는 해당요일 빼는거
        sum += b -1 ;

        return answer = day[sum%7];
    }
}
