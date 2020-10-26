package gsm;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM19 {

	public static void main(String[] args) {
		// Animal 클래스로 Dog, Cat의 모든 기능을 동작시키시오.
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		
		ani = new Cat();
		ani.eat();
		ani.move();
		// 다형성(상속, override(재정의), upcasting, 동적바인딩)
		// 상위클래스가 	동일한 메세지로 하위클래스들을 서로다르게 동작시키는 객체지향원리
		((Cat)ani).night();
	}

}
