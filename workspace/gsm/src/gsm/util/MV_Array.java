package gsm.util;

public class MV_Array {
	 private MovieVO[] arr;
     private int cnt; // 0
     //배열에 실제 저장된 원소의 개수를 구하는 동작
     public int size() {
        return cnt;
     }
     public MV_Array() {
        // 10개의 크기로 만들어준다.
        //arr=new int[10];
        this(10);
     }    
     public MV_Array(int inital) {
        arr=new MovieVO[inital];
     }
     //배열에 데이터를 저장하는 동작(add)
     public void add(MovieVO data) {
           arr[cnt++]=data;
     }    
     //원하는 index의 데이터를 가져오는 동작(get)
     public MovieVO get(int index) {
        return arr[index];
     }

}
