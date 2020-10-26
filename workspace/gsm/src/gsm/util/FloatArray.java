package gsm.util;

public class FloatArray {
	private float[] arr;
	private int cnt;
	
	// �迭�� ���� ����� ������ ������ ���ϴ� ����
	public int size() {
		return cnt;
	}
	
	public FloatArray() {
		// 10���� ũ��� ����� �ش�
//		arr = new int[10];
		this(10);
	}
	
	public FloatArray(int initial) {
		arr = new float[initial];
	}
	
	// �迭�� �����͸� �����ϴ� ����(Add)
	public void add(float data) {
		arr[cnt++]=data;
	}
	
	// ���ϴ� index�� �����͸� �������� ����(get)
	public float get(int index) {
		return arr[index];
	}
}
