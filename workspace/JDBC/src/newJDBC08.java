import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class newJDBC08 {

	public static void main(String[] args) {
		String id="java";
		String pwd="java1004";
		int age=21;
		// tblmem table에서 id가 java인 회원의 pwd를 java1004로, age를 21로 수정하시오.
		// 수정 성공, 수정 실패
		String SQL = "update tblmem set pwd=?, age=? where id=?";
		String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String password = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(URL, user, password);
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, pwd);
			ps.setInt(2, age);
			ps.setString(3, id);
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
