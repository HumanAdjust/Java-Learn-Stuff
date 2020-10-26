package gsm;

import gsm.util.FloatArray;

public class Gsm13 {

	public static void main(String[] args) {
		// FloatArray 객체를 만들고 5개의 실수 데이터를 저장하고 출력하는 코드를 작성하시오.
		// 출력하는 코드를 작성하시오
		// FloatArray 클래스를 만들고 (add, get, size)
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
