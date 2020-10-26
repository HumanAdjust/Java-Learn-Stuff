package gsm;

import gsm.util.MV_Array;
import gsm.util.MovieVO;

public class GSM14 {

	public static void main(String[] args) {
		// 영화 3편을 MovieArray 클래스에 저장하고 출력하시오
		// new MV_Array
		MV_Array mv = new MV_Array();
		
		MovieVO mv1 = new MovieVO("쥬라기 공원", "정상현", 11500, 4);
		MovieVO mv2 = new MovieVO("아이언맨 3", "로버트 다우니 주니어", 20500, 2);
		MovieVO mv3 = new MovieVO("겨울왕국", "엘사", 13000, 1);
		
		mv.add(mv1);
		mv.add(mv2);
		mv.add(mv3);

		for (int j = 0; j < mv.size(); j++) {
			System.out.println(mv.get(j));
		}
	}

}
