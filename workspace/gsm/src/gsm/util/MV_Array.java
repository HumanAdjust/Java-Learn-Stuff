package gsm.util;

public class MV_Array {
	 private MovieVO[] arr;
     private int cnt; // 0
     //�迭�� ���� ����� ������ ������ ���ϴ� ����
     public int size() {
        return cnt;
     }
     public MV_Array() {
        // 10���� ũ��� ������ش�.
        //arr=new int[10];
        this(10);
     }    
     public MV_Array(int inital) {
        arr=new MovieVO[inital];
     }
     //�迭�� �����͸� �����ϴ� ����(add)
     public void add(MovieVO data) {
           arr[cnt++]=data;
     }    
     //���ϴ� index�� �����͸� �������� ����(get)
     public MovieVO get(int index) {
        return arr[index];
     }

}
