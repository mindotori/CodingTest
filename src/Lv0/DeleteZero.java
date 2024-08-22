package Lv0;

public class DeleteZero {

        public String solution(String n_str) {
            // 0이 아닌 문자가 나올 때까지 탐색 후, 그 부분부터 나머지 문자열 반환
            int i = 0;
            while (i < n_str.length() && n_str.charAt(i) == '0') {
                i++;
            }

            // 모든 문자가 '0'이라면 빈 문자열을 반환하고, 그렇지 않으면 남은 부분을 반환
            return n_str.substring(i);
        }

}
