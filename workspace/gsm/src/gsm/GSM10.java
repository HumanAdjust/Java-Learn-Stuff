package gsm;

import gsm.util.MyUtil;

public class GSM10 {

	public static void main(String[] args) {
		int v=MyUtil.hap(10, 20);
		float vv=MyUtil.hap(10.5f, 25.6f);
		System.out.println(v);
		System.out.println(vv);
		//�ݵ�� ������ �޼���� public���� �ؾ��Ѵ�? x
//		MyUtil my = new MyUtil();
//		int vvv = my.hap(23, 23);
//		System.out.println(vvv);
//		System sys = new System();
//		Math m = new Math(); X
		int a = 20;
		int b = 30;
		// ����: a, b ���� �ִ� ���� ���Ͽ� ����Ͻÿ�. ��, MathŬ������ max()�Լ��� �̿�
		System.out.println(Math.max(20, 30));
	}

}
