package gsm.poly;

public abstract class Animal { //불완전한 클래스
	public abstract void eat(); //추상메서드
	public abstract void move(); //추상메서드
	public void play() {
		System.out.println("집에서 함께 생활한다.");
	}
}
//public class Animal {
//	public void eat() {
//		System.out.println("동물처럼 먹다.");
//	}
//	
//	public void move() {
//		System.out.println("이동한다.");
//	}
//}
