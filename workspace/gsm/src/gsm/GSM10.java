package gsm;

import gsm.util.MyUtil;

public class GSM10 {

	public static void main(String[] args) {
		int v=MyUtil.hap(10, 20);
		float vv=MyUtil.hap(10.5f, 25.6f);
		System.out.println(v);
		System.out.println(vv);
		//반드시 생성자 메서드는 public으로 해야한다? x
//		MyUtil my = new MyUtil();
//		int vvv = my.hap(23, 23);
//		System.out.println(vvv);
//		System sys = new System();
//		Math m = new Math(); X
		int a = 20;
		int b = 30;
		// 문제: a, b 수중 최대 값을 구하여 출력하시오. 단, Math클래스의 max()함수를 이용
		System.out.println(Math.max(20, 30));
	}

}
