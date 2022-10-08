package 큐;

public class ArrayQueque {

	private int[] que; //큐 배열
	private int capacity; //큐 용량
	private int ptr; // 맨 앞의 요소 포인터
	
	
	//큐가 비어있음
	public class EmptyQueueException extends RuntimeException{
		public EmptyQueueException() {
			System.out.println("큐가 비어있습니다!");
		}
	}
	
	//큐가 가득차있음
	public class OverflowQueueException extends RuntimeException{
		public OverflowQueueException() {
			System.out.println("큐가 가득 차있습니다!");
		}
	}
	
	//생성자
	public ArrayQueque(int max) { //ArrayQueue 생성지 사용자가 크기 지정
		que = new int[max]; //사용자가 지정한 크기만큼 공간 할당
		capacity = max; // 사용자가 지정한 크기
		ptr =0; //최초로 들어오는 요소는 0번 인덱스로
	}
	
	//요소삽입
	public int add(int n) {
		if(ptr>=capacity) {
			throw new OverflowQueueException();
		} else {
			que[ptr] = n; //큐에 요소 넣기
			ptr++; //포인터 1 증가
			return que[ptr-1];
		}
	}
	
	//요소삭제
	public int remove() {
		if (ptr <= 0) { //isEmpty
			throw new EmptyQueueException();
		} else {
			if (ptr==1) {
				que[0]= que[1];
			}
			for (int i = 0; i < ptr-1; i++) {
				int x = que[i++];
				que[i] = que[i + 1];
				
				
			}
			ptr--;
			return que[0];
		}
	}
		
	
	
	// 맨 앞 요소 확인
	public int peek() {
		if(isEmpty()) { //큐가 비어있으면 예외 처리
			throw new EmptyQueueException();
		} else {
			return que[ptr];
		}
	}
	
	//큐가 비어있는지? 비어있으면 true 아니면 false
	public boolean isEmpty() {
		return ptr<=0;
	}
		
	//큐가 가득 차있는지? 차있으면 true 아니면 false
	public boolean isFull() {
		return ptr>=capacity;
	}
	
}
