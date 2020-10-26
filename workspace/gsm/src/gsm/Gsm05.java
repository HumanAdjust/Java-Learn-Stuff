package gsm;

public class Gsm05 {

	public static void main(String[] args) {
		// [성적]데이터 1개를 저장하기위한 [변수를 선언]하시오.
		
		SungJuck sj=new SungJuck();
		System.out.println(sj.b_num);
		System.out.println(sj.b_ban);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		
		SungJuck sj1 = new SungJuck(3116, 1, 78.6f, 86.3f);
		System.out.println(sj1.b_num);
		System.out.println(sj1.b_ban);
		System.out.println(sj1.kor);
		System.out.println(sj1.eng);
	}

}
