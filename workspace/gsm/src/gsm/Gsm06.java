package gsm;

public class Gsm06 {

	public static void main(String[] args) {
		// å->�ڹ� ȫ�浿 24000 500
		BookDTO b=new BookDTO();
		b.setTitle("�ڹ�");
		b.setName("��浿");
		b.setPrice(24000);
		b.setPage(500);
		
		System.out.println(b.getTitle()+"\t"+b.getName()+"\t"+b.getPrice()+"\t"+b.getPage()+"\t");
		System.out.println(b.toString());
		
		BookDTO b1=new BookDTO("����Ŭ", "���ڹ�", 34000, 700);
		System.out.println(b1.getTitle()+"\t"+b1.getName()+"\t"+b1.getPrice()+"\t"+b1.getPage()+"\t");
	}
/* ���
 * �ڹ� ȫ�浿 24000 500
 */
}
