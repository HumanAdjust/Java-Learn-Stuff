package gsm;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM19 {

	public static void main(String[] args) {
		// Animal Ŭ������ Dog, Cat�� ��� ����� ���۽�Ű�ÿ�.
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		
		ani = new Cat();
		ani.eat();
		ani.move();
		// ������(���, override(������), upcasting, �������ε�)
		// ����Ŭ������ 	������ �޼����� ����Ŭ�������� ���δٸ��� ���۽�Ű�� ��ü�������
		((Cat)ani).night();
	}

}
