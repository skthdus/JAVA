package 큐;

public class LinkedListQueue {
	private Node front; //현재 맨 앞 노드의 주소값
	private Node rear; // 맨 뒤 노드의 주소값
	private int size; // 큐 사이즈
	
	public LinkedListQueue() {
		front = null; // 맨 앞 노드 초기화
		rear = null; // 맨 뒤 노드 초기화
		this.size = size; // 큐 사이즈 초기화
	}
	
	//큐가 비어있는 경우 예외처리
	public class EmptyQueueException extends RuntimeException{
		public EmptyQueueException() {
			System.out.println("큐는 비어있습니다!");
		}
	}
	
	//요소 삽입, 삽입된 요소의 데이터 반환
	public int add(int n) {
		Node newNode = new Node(n); //노드 생성 데이터부분 초기화
		newNode.linkNode(front); //현재 맨 앞 노드의 주소값 새로 생성
		front = newNode; //새로 생성된 노드가 맨 앞이 되도록 수정
		
		return newNode.getData();
		
	}
	
	//요소 삭제, 삭제된 요소의 데이터 반환
	public int remove() {
		if(front==null) {
			throw new EmptyQueueException();
		} else {
			int data = front.getData(); //맨 앞 위치 바꾸기
			front = front.getNextNode(); //맨 앞이 가지고 있는 주소데이터
			return data;
		}
	}
	//맨 앞 노드 데이터 가져오기
	public int peek() {
		return front.getData();
		
	}
	// 큐가 비어있는지 , 비어있으면 true 비어있지 않으면 false
		public boolean isEmpty() {
			return front==null;
		}
}
