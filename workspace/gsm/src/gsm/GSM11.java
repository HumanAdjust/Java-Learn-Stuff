package gsm;

import gsm.util.IntArray;

public class GSM11 {

	public static void main(String[] args) {
		//float v = MyUtil.hap(34.5f, 67.8f);
//		System.out.println(v);
		// 배열처럼 동작하는 클래스(API) -> IntArray
		//1. 배열처럼 동작하는 클래스 (API) -> IntArray
		int[] arr = new int[5];
		
		// 10개를 저장할 수 있는 IntArray 객체를 생성하시오.(2가지 방법으로)
		IntArray a1 = new IntArray();
		//IntArray a2 = new IntArray(10);
		
		// 2. 배열에 데이터를저장하는 동작
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		// 3. index가 2인 데이터를 가져오는 동작
		int v = arr[2];
		
		int data = a1.get(2);
		System.out.println(data);
		
		// 4. 배열에 실제 저장된 원소의 개수를 구하는 동작
		int cnt = arr.length;
		System.out.println(cnt);
		
		int leng=a1.size();
		System.out.println(leng); // 3
		for (int i=0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}

}
