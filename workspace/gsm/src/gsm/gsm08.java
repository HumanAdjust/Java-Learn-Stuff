package gsm;

public class gsm08 {
	//메서드=머리(원형=프로토타입) + 몸(바디=구현부)
	public static void main(String[] args) {
		// 메서드 => 동작(행위정보)
		// 메서드를 호출(call -> 부른다)
		int v = total(1, 10); // parameter passing(인수전달기법)->Call By Value
		System.out.println(v);
		gsm08 g = new gsm08();
		int t = twoHap(1, 100);
		System.out.println(t);
	}
	// 매게변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
	public static int total(int a, int b){
		int value = a+b; // value -> 만들어낸 결과 값
		return value;
	}
	
	// 매개변수로 두개의 정수를 받아서 두 수 사이의 총합을 구하여 리턴하는 메서드를 정의하시오.
	public static int twoHap(int a, int b){
		int value = 0;
		for(int i=a; i <= b; i++) {
			value += i;
		}
		return value;
	}
}
