package 트리;

import java.util.TreeSet;

public class Ex01트리생성 {

	public static void main(String[] args) {
		
		//1. 이진트리 생성
		TreeSet<Integer> ts = new TreeSet<>();
		
		//2. 요소삽입
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		
		//3. 이진트리의 크기 (요소 갯수)
		System.out.println(ts.size());
		
		//4. 이진트리의 최솟값, 최댓값
		System.out.println(ts.first()+ "," + ts.last());
		
		//5. 특정값보다 큰 데이터 중 최솟값 찾기
		System.out.println(ts.higher(3));
		//6. 특정값보다 작은 데이터 중 최댓값 찾기
		System.out.println(ts.lower(3));
		
	}

}
