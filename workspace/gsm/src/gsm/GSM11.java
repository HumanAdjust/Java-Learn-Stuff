package gsm;

import gsm.util.IntArray;

public class GSM11 {

	public static void main(String[] args) {
		//float v = MyUtil.hap(34.5f, 67.8f);
//		System.out.println(v);
		// �迭ó�� �����ϴ� Ŭ����(API) -> IntArray
		//1. �迭ó�� �����ϴ� Ŭ���� (API) -> IntArray
		int[] arr = new int[5];
		
		// 10���� ������ �� �ִ� IntArray ��ü�� �����Ͻÿ�.(2���� �������)
		IntArray a1 = new IntArray();
		//IntArray a2 = new IntArray(10);
		
		// 2. �迭�� �����͸������ϴ� ����
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		// 3. index�� 2�� �����͸� �������� ����
		int v = arr[2];
		
		int data = a1.get(2);
		System.out.println(data);
		
		// 4. �迭�� ���� ����� ������ ������ ���ϴ� ����
		int cnt = arr.length;
		System.out.println(cnt);
		
		int leng=a1.size();
		System.out.println(leng); // 3
		for (int i=0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}

}
