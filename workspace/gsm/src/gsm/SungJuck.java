package gsm;

public class SungJuck {
	public int b_num;
	public int b_ban;
	public float kor;
	public float eng;
	
	//디폴트 생성자 메서드
	public SungJuck() {
		// 자신의 기본정보를 초기화 하시오.
		b_num = 3116;
		b_ban = 1;
		kor = 0;
		eng = 0;
	}
	
	public SungJuck(int b_num, int b_ban, float kor, float eng) {
		this.b_num = b_num;
		this.b_ban = b_ban;
		this.kor = kor;
		this.eng = eng;
	}
}
