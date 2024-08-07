package Lv0;

public class ProductAndSum {
    static class Solution {
        public int solution(int[] num_list) {
            // 곱의 초기값이 0이면 결과가 0만 나옴. 그러니 1로 변경
            int product = 1;
            int sum = 0;
            for(int i=0;i<num_list.length;i++){
                product *= num_list[i];
                sum += num_list[i];
            }
            System.out.println(product);
            System.out.println(sum);
            if(product<sum*sum){
                return 1;
            } else {
                return 0;
            }

        }
    }
}
