package gsm;

public class SungJuck {
	public int b_num;
	public int b_ban;
	public float kor;
	public float eng;
	
	//����Ʈ ������ �޼���
	public SungJuck() {
		// �ڽ��� �⺻������ �ʱ�ȭ �Ͻÿ�.
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
