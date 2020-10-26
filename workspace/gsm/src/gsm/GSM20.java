package gsm;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM20 {

	public static void main(String[] args) {
		// 다형성 -> 부모클래스를 이용하는 것
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
	}
	
	private static void display(Animal ani) {
		ani.eat();
		ani.move();
		//Cat일 경우에만 다운캐스팅 --> if
		((Cat)ani).night(); // X
	}

}
