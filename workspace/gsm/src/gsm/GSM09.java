package gsm;
import gsm.util.MyUtil;
// 1. ¹®Á¦
import java.lang.*;

public class GSM09 {

	public static void main(String[] args) {
		int v = MyUtil.hap(10, 20);
		System.out.println(v);
		
		MyUtil my=new MyUtil();
		float f=my.hap(45.6f, 67.8f);
		System.out.println(f);
		
		String su = "100";
		int s = Integer.parseInt(su);
		System.out.println(s);
		String a = "100";
		String b = "200";
		// 2. a + b = 300
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
	}

}
