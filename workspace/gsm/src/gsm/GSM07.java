package gsm;

public class GSM07 {

	public static void main(String[] args) {
		// å 3���� �޸𸮿� �����ϰ� ����Ͻÿ�
		// ����� for������ ����Ͻÿ�.
		BookDTO[] b=new BookDTO[3];
		b[0] = new BookDTO("�ڹ�", "������", 32000, 400);
		b[1] = new BookDTO("����Ŭ", "�ǾƳ�", 22000, 320);
		b[2] = new BookDTO("JS", "ġ����", 42000, 720);
		
		System.out.println("����\t�̸�\t����\t������");
		System.out.println("----------------------------------------------------");
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i].title + "\t" + b[i].name + "\t" + b[i].price + "\t" + b[i].page);
		}
		
		System.out.println();
		System.out.println();
		for(BookDTO v: b) {
			System.out.println(v.getTitle()+"\t"+v.getName()+"\t"+v.getPage()+"\t"+v.getPrice());
		}
		
	}

}
/*
 * -�������-
 * ����    �̸�    ����     ������
 * --------------------
 * �ڹ�  ���ڹ�  32000 400
 * ����Ŭ  ���浿  22000 320
 * JS �ڱ浿  42000  720
 */
