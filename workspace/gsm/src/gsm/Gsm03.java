package gsm;

public class Gsm03 {

	public static void main(String[] args) {
		int b_num = 1001;
		int b_ban = 3;
		float kor = 67.3f;
		float eng = 89.6f;
		
		// 정수 1개를 저장할 [변수를 선언]하시오.
		// 성적 데이터를 저장할 [변수를 생성]하시오.
		SungJuck sj;
		sj=new SungJuck();
		sj.b_num=b_num;
		sj.b_ban=b_ban;
		sj.kor=kor;
		sj.eng=eng;
		System.out.println(sj.b_num);
		System.out.println(sj.b_ban);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
	}

}
