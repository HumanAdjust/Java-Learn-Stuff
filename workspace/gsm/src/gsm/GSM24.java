package gsm;

import gsm.poly.*;

public class GSM24 {

    public static void main(String[] args) {
        // ������ -> ���, upcasting, override, �������ε�
        Animal ani = new Cat();
        System.out.println("3116_������");
        ani.eat();
        ani.move();
        
        //Animal a = new Animal(); // �߻�Ŭ������ �ν��Ͻ� ���� �� ����.
    }

}