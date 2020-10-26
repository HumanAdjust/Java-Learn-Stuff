package kr.gsm.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	public Connection getConnect() {
		//Connection
		String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user="hr";
		String password="hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL,user,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	// memInsert() - 완성
	public int memInsert(MemVO vo) {
		int cnt=0;
		conn=getConnect();
		String SQL = "insert into mygsm values(?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPwd());
			ps.setInt(3, vo.getAge());
		
			cnt = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
	}
	
	public int memDelete(String id) {
		int cnt=0;
		conn=getConnect();
		String SQL = "delete from mygsm where id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, id);
		
			cnt = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
	}
	
	public int memUpdate(MemVO vo) {
		int cnt=0;
		conn=getConnect();
		String SQL = "update mygsm set pwd=?, age=? where id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getPwd());
			ps.setInt(2, vo.getAge());
			ps.setString(3, vo.getId());
		
			cnt = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
	}
	
	public MemVO memContent(String id) {
		MemVO vo = null;
		conn = getConnect();
		String SQL = "select * from mygsm where id=?";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				id = rs.getString("id");
				String pwd = rs.getString("pwd");
				int age = rs.getInt("age");
				vo = new MemVO(id, pwd, age);
			}
		}catch(Exception e) {
			
		}finally {
			dbClose();
		}
		return vo;
	}
	
	//memAllList()
	public List<MemVO> memAllLIst() {
		List<MemVO> list = new ArrayList<MemVO>();
		conn = getConnect();
		String SQL="select * from mygsm";
		try {
			ps = conn.prepareStatement(SQL);
			rs=ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				int age=rs.getInt("age");
				//묶고->담고
				MemVO vo = new MemVO(id, pwd, age);
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		return list;
	}//memAllList
		
	public void dbClose() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
