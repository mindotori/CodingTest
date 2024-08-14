package Lv0;
import java.util.*;
public class PCCE_CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();    // 태어난 연도
        String age_type = sc.next();  // 나이 유형 ("Korea" 또는 "Year")
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;  // 한국식 나이 계산
        }
        else if (age_type.equals("Year")) {
            answer = 2030 - year;  // 서양식 나이 계산
        }

        System.out.println(answer);  // 계산된 나이 출력
    }
}
