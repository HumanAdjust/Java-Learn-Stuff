package gsm;

public class GSM07 {

	public static void main(String[] args) {
		// 책 3권을 메모리에 저장하고 출력하시오
		// 출력은 for문으로 출력하시오.
		BookDTO[] b=new BookDTO[3];
		b[0] = new BookDTO("자바", "정상현", 32000, 400);
		b[1] = new BookDTO("오라클", "피아나", 22000, 320);
		b[2] = new BookDTO("JS", "치레나", 42000, 720);
		
		System.out.println("제목\t이름\t가격\t페이지");
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
 * -출력형식-
 * 제목    이름    가격     페이지
 * --------------------
 * 자바  박자바  32000 400
 * 오라클  나길동  22000 320
 * JS 박길동  42000  720
 */
