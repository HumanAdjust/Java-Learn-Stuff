import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="newdata";
		String pwd="newpwd";
		int age=10;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			Connection conn = DriverManager.getConnection(URL, user, password);
			Statement st = conn.createStatement();
			// ����=> '"+����+"'
			String SQL = "insert into mygsm values('"+id+"','"+pwd+"',"+age+")";
			int cnt = st.executeUpdate(SQL);
			if(cnt > 0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}