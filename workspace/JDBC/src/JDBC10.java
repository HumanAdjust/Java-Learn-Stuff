import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC10 {

	public static void main(String[] args) {
		String id="bit";
		String pwd="java1004";
		int age=21;
		// tblmem table���� id�� java�� ȸ���� pwd�� java1004��, age�� 21�� �����Ͻÿ�.
		// ���� ����, ���� ����
		String SQL = "update mygsm set pwd=?, age=? where id=?";
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
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
