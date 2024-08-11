package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
public class Divisible {
        public int[] solution(int[] arr, int divisor) {
            // ArrayList는 동적 할당 / Array는 정적 할당
            ArrayList<Integer> list = new ArrayList<>();

            //for-each
            for (int i : arr) {
                if (i % divisor == 0) {
                    list.add(i);
                }
            }
            //  == for(int i=0;i<arr.length;i++){
            //            if(arr[i]%divisor==0){
            //                list.add(arr[i]);
            //            }
            //        }
            // divisor로 나눠떨어지는 것이 없으면(=배열이 비어있으면 -1담은 배열 반환)
            if(list.isEmpty()){
                return new int[]{-1};
            }

            int[] answer = new int[list.size()];
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
            }
            // 오름차순정렬
            Arrays.sort(answer);
            return answer;
        }

    public static void main(String[] args) {
        Divisible divisible = new Divisible();

        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;
        System.out.println(Arrays.toString(divisible.solution(arr1, divisor1)));
        // 출력 예상: [5, 10]
    }
    }

