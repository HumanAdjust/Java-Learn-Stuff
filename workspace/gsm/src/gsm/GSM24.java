package gsm;

import gsm.poly.*;

public class GSM24 {

    public static void main(String[] args) {
        // 다형성 -> 상속, upcasting, override, 동적바인딩
        Animal ani = new Cat();
        System.out.println("3116_정상현");
        ani.eat();
        ani.move();
        
        //Animal a = new Animal(); // 추상클래스라 인스턴스 만들 수 없음.
    }

}