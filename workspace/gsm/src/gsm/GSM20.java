package gsm;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM20 {

	public static void main(String[] args) {
		// ������ -> �θ�Ŭ������ �̿��ϴ� ��
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
	}
	
	private static void display(Animal ani) {
		ani.eat();
		ani.move();
		//Cat�� ��쿡�� �ٿ�ĳ���� --> if
		((Cat)ani).night(); // X
	}

}
