import java.util.Scanner;

import kr.erp.*;

public class JDBC11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID: ");
		String id=scan.next();
		
		System.out.println("PWD: ");
		String pwd=scan.next();
		
		System.out.print("AGE: ");
		int age=Integer.parseInt(scan.next()); //"21"->21
		
		MemVO vo = new MemVO(id, pwd, age);
		MemDAO dao = new MemDAO();
		int cnt = dao.memInsert(vo);
		if(cnt > 0) {
			System.out.println("�Է¼���");
		}else {
			System.out.println("�Է½���");
		}
	}
}
