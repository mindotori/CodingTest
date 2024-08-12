package Lv1;

public class DeleteMinNum {
    public int[] solution(int[] arr) {
        // arr.length가 1 미만이면 false
        if(arr.length<=1){
            return new int[]{-1};
        }

        //최솟값 설정
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        //정답 담을 answer 배열 선언
        int[] answer = new int[arr.length-1];
        //answer[i] = arr[i]대신에 idx값 ++식으로 순회
        //answer[idx++] = arr[i] 사용
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min){
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}
