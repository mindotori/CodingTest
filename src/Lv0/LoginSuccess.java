package Lv0;

public class LoginSuccess {
    static class Solution {
        public String solution(String[] id_pw, String[][] db) {
            //id, pw 쪼개기
            String id = id_pw[0];
            String pw = id_pw[1];

            for(int i=0;i<db.length;i++){
                //db - id/pw 쪼개기
                String dbId = db[i][0];
                String dbPw = db[i][1];
                //.equals() 사용
                // 아이디가 일치하는지 확인
                if (id.equals(dbId)) {
                    // 비밀번호가 일치하는지 확인
                    if (pw.equals(dbPw)) {
                        return "login"; // 아이디와 비밀번호가 모두 일치하면 "login" 반환
                    } else {
                        return "wrong pw"; // 아이디는 맞지만 비밀번호가 틀리면 "wrong pw" 반환
                    }
                }
            }
            return "fail";
        }
    }
}
