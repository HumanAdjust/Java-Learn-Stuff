import java.sql.*;
public class JDBC03 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password="hr";    
            // 1. 연결객체 생성
            Connection conn = DriverManager.getConnection(URL, user, password);
            if(conn!=null) {
                System.out.println("접속성공");
            }else {
                System.out.println("접속실패");
            }
            
            // 수정SQL=>id가 gsm인 회원의 비밀번호
            String SQL ="update mygsm SET pwd='1004',age=15 where id='gsm'";
            
            // 2. SQL문장전송객체(Ststement)
            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
            System.out.println("입력 성공");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}