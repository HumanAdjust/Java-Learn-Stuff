package gsm.util;

public class MyUtil {
	private MyUtil() {
		
	}
	// �����ε�(Overloding)
	// ���� 2���� �Ű������� �޾Ƽ� ���� ���Ͽ� �����ϴ� �޼��� ���� (hap)
	public static int hap(int a, int b) {
		return a+b;
	}
	
	// �Ǽ� 2���� �Ű������� �޾Ƽ� ���� ���Ͽ� �����ϴ� �޼��� ���� (hap)
	public static float hap(float a, float b) {
		return a+b;
	}
}
/*
 * Model
 * 1. DTO(VO) -> �ٱ���
 * 2. Utility
 * 3. DAO -> SQL : CRUD -> JDBC Programming
 */
