package 어레이리스트;

import java.util.ArrayList;

public class Ex01arraylist생성 {

	public static void main(String[] args) {
	
		//1. ArrayList 생성
		//                 				     크기지정(기본값 : 10)
		ArrayList<String> al = new ArrayList<>(7);
		
		//2. 요소 삽입
		//2-1. 맨 마지막 자리에 삽입
		al.add("python");  		//0
		al.add("java");    		//1
		al.add("javascript");   //2
		
		//2-2. 특정 자리에 삽입(인덱스번호(int), 삽입할 데이터)
		al.add(1,"c++");
		
		//3. 요소 개수
		int n = al.size();
		System.out.println(n);
		
		//4. 특정 위치의 요소 알아내기
		System.out.println(al.get(1));
		
		for (String s:al) {
			System.out.println(s);
		}
		
		//5. 요소 삭제
		//5-1. 특정 인덱스에 요소 삭제
		al.remove(2);
		
		//5-2. 전체 삭제
		al.clear();
		
		for (String s:al) {
			System.out.println(s);
		}
		
		
		

	}

}
