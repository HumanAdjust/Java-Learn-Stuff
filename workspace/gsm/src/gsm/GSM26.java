package gsm;

import gsm.poly.*;

public class GSM26 {

	public static void main(String[] args) {
		// RemoCon���� TV�� Radio�� ���۽�Ű�ÿ�.
		RemoCon remo = new TV();
		remo.volUP();
		remo.volDOWN();
		remo.internet();
		
		remo = new Radio();
		remo.volUP();
		remo.volDOWN();
		remo.internet();
	}

}
