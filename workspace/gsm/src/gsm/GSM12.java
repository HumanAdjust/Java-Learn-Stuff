package gsm;

import gsm.util.IntArray;

public class GSM12 {

	public static void main(String[] args) {
		// IntArray�� ���� 7���� �����ϰ� ��ü�� ����Ͻÿ�.
		// ù��° ���ڴ� �л���ȣ�� �����ϰ� 6���� �������...
		IntArray a1 = new IntArray();
		
		a1.add(3116);
		a1.add(35);
		a1.add(11);
		a1.add(235);
		a1.add(234);
		a1.add(34);

		for (int j = 0; j < a1.size(); j++) {
			System.out.println(a1.get(j));
		}
	}

}
