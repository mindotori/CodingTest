package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
public class Divisible {
        public int[] solution(int[] arr, int divisor) {
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
            if(list.isEmpty()){
                return new int[]{-1};
            }

            int[] answer = new int[list.size()];
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
            }
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

