package Lv0;
import java.util.*;
public class MakeMaxProduct {
    public int solution(int[] numbers) {
        int answer = 0;
        //오름차순
        Arrays.sort(numbers);

        int n = numbers.length;
        answer = numbers[n-1] * numbers[n-2];

        return answer;
    }
}
