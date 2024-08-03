package Lv1;

public class RemainedNum1 {
    public int solution(int n){
        //x를 2부터 시작해서 n % x == 1을 만족하는 x를 찾기
        for(int x = 2; x < n; x++){
            if(n % x == 1){
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RemainedNum1 sol = new RemainedNum1();
        int n = 10;
        System.out.println(sol.solution(n));  // 출력: 3 (10 % 3 == 1)

        n = 12;
        System.out.println(sol.solution(n));  // 출력: 11 (12 % 11 == 1)
    }
}
