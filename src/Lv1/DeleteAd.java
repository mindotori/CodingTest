package Lv1;
import java.util.*;
public class DeleteAd {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                answer.add(strArr[i]);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}
