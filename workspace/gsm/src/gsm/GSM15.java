package gsm;

import gsm.util.Cat;
import gsm.util.Dog;

public class GSM15 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("港港捞");
		d.setAge(3);
		
		System.out.println(d);
		
		Cat c = new Cat();
		c.setName("具克捞");
		c.setAge(2);
		
		System.out.println(c);
	}
}
