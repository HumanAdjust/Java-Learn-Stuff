package gsm;

import gsm.util.MV_Array;
import gsm.util.MovieVO;

public class GSM14 {

	public static void main(String[] args) {
		// ��ȭ 3���� MovieArray Ŭ������ �����ϰ� ����Ͻÿ�
		// new MV_Array
		MV_Array mv = new MV_Array();
		
		MovieVO mv1 = new MovieVO("���� ����", "������", 11500, 4);
		MovieVO mv2 = new MovieVO("���̾�� 3", "�ι�Ʈ �ٿ�� �ִϾ�", 20500, 2);
		MovieVO mv3 = new MovieVO("�ܿ�ձ�", "����", 13000, 1);
		
		mv.add(mv1);
		mv.add(mv2);
		mv.add(mv3);

		for (int j = 0; j < mv.size(); j++) {
			System.out.println(mv.get(j));
		}
	}

}
