package 링크드리스트;

import java.util.LinkedList;

public class Ex01링크드리스트생성 {

	public static void main(String[] args) {
		
		//1. 링크드리스트 생성
		LinkedList<String> llist= new LinkedList<>();
		
		//2. 요소 삽입
		llist.add("apple");
		llist.add("banana");
		
		//3. 요소 삭제
		System.out.println(llist.remove());
		
		//3. 요소 전체 삭제
		llist.clear();	
	}

}
