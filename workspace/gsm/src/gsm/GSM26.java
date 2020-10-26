package gsm;

import gsm.poly.*;

public class GSM26 {

	public static void main(String[] args) {
		// RemoCon으로 TV와 Radio를 동작시키시오.
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
