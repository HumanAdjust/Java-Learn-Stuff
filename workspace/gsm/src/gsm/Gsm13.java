package gsm;

import gsm.util.FloatArray;

public class Gsm13 {

	public static void main(String[] args) {
		// FloatArray ��ü�� ����� 5���� �Ǽ� �����͸� �����ϰ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		// ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		// FloatArray Ŭ������ ����� (add, get, size)
		// 3112.0f, 34.5f ~
		FloatArray f1 = new FloatArray();
		
		f1.add(3116.0f);
		f1.add(35.0f);
		f1.add(11.4f);
		f1.add(235.2f);
		f1.add(234.1f);

		for (int j = 0; j < f1.size(); j++) {
			System.out.print(f1.get(j) + "\t");
		}
	}

}
