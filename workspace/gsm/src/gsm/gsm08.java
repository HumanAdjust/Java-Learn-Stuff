package gsm;

public class gsm08 {
	//�޼���=�Ӹ�(����=������Ÿ��) + ��(�ٵ�=������)
	public static void main(String[] args) {
		// �޼��� => ����(��������)
		// �޼��带 ȣ��(call -> �θ���)
		int v = total(1, 10); // parameter passing(�μ����ޱ��)->Call By Value
		System.out.println(v);
		gsm08 g = new gsm08();
		int t = twoHap(1, 100);
		System.out.println(t);
	}
	// �ŰԺ����� 2���� ������ �޾Ƽ� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
	public static int total(int a, int b){
		int value = a+b; // value -> ���� ��� ��
		return value;
	}
	
	// �Ű������� �ΰ��� ������ �޾Ƽ� �� �� ������ ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
	public static int twoHap(int a, int b){
		int value = 0;
		for(int i=a; i <= b; i++) {
			value += i;
		}
		return value;
	}
}
