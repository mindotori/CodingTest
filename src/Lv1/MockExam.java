package Lv1;
import java.util.ArrayList;
public class MockExam {
        public int[] solution(int[] answers) {

            // 반복하는만큼 담아두기
            int[] num1 = {1, 2, 3, 4, 5};
            int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] count = new int[3];

            // 정답과 비교하여 각 수포자들의 맞춘 문제 수 계산
            // 모듈러 연산 사용(%) - 반복하는 경우에 사용될 수 있음
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == num1[i % num1.length]) {
                    count[0]++;
                }
                if (answers[i] == num2[i % num2.length]) {
                    count[1]++;
                }
                if (answers[i] == num3[i % num3.length]) {
                    count[2]++;
                }
            }

            // 최대값 찾기
            int max = count[0];
            for(int i=0;i<count.length;i++){
                if(max<count[i]){
                    max = count[i];
                }
            }

            // 최대값과 같은 수포자 번호 저장
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                if (count[i] == max) {
                    list.add(i + 1);
                }
            }

            // ArrayList를 int[]로 변환하여 반환
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }


