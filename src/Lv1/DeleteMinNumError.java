package Lv1;

public class DeleteMinNumError {
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
        //정답 담을 answer 배열 선언 (최솟값 제거니까 배열 크기 -1)
        int[] answer = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            // answer에는 최솟값만 빼고 담는다
            if(arr[i]!=min){
                answer[i] += arr[i];
            }
        }
        return answer;
    }
}
