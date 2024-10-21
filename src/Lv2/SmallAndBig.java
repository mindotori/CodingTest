package Lv2;

import java.util.ArrayList;
import java.util.List;

public class SmallAndBig {
    //최댓값과 최솟값
    public static void main(String[] args) {
        SmallAndBig obj = new SmallAndBig();
        String result = obj.solution("-1 -2 -3 -4");
        System.out.println(result);
    }


    public String solution(String s) {
        List<Integer> list = new ArrayList<>();

        //공백을 기준으로 문자열을 분리
        String[] numbers = s.split(" ");

        for (String num : numbers) {
            //문자열이 비어있지 않은 경우에만 처리
            if(!num.isEmpty()){
                int n = Integer.parseInt(num);
                list.add(n);
        }

//            이렇게하면 "-1 -2 -3 -4"같은 음수 처리 못함
//        for (int i = 0; i < s.length(); i++) {
//            //공백이 아닌 경우에만 처리해야함
//            if (s.charAt(i) != ' ') {
//                int n = Character.getNumericValue(s.charAt(i));
//                list.add(n);
//            }
        }
        //min과 max 초기값 설정
        int min = list.get(0);
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        // int에 " "(문자열)을 결합하면 자동으로 int to String
        return min + " " + max; //"1 4"같은 형태로 변환
    }
}
