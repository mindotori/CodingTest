package Lv1;

public class Sqrt{
    public long solution(long n) {
        long answer = 0;
        long a = (long)Math.sqrt(n);
        //System.out.println(n);
        if(a*a==n){
            a = a+1;
            answer = (long)Math.pow(a,2);
        } else {
            answer = -1;
        }
        return answer;
    }
}

