package gsm.util;

public class MyUtil {
	private MyUtil() {
		
	}
	// 오버로딩(Overloding)
	// 정수 2개를 매개변수로 받아서 합을 구하여 리턴하는 메서드 정의 (hap)
	public static int hap(int a, int b) {
		return a+b;
	}
	
	// 실수 2개를 매개변수로 받아서 합을 구하여 리턴하는 메서드 정의 (hap)
	public static float hap(float a, float b) {
		return a+b;
	}
}
/*
 * Model
 * 1. DTO(VO) -> 바구니
 * 2. Utility
 * 3. DAO -> SQL : CRUD -> JDBC Programming
 */
