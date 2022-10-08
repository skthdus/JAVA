package 큐;

public class LinkedListQueue_ {
	private Node_ front; //front 노드 주소
	private Node_ rear; //rear 노드 주소
	private int num; //큐 요소 개수
	
	//생성자 
	public LinkedListQueue_() {
		front = null;
		rear = null;
		num = 0;
	}
	
	//큐가 비어있을 때 -> 값을 삭제 하지 못함!
	public class EmptyQueueException extends RuntimeException{
		public EmptyQueueException() {
			System.out.println("큐가 비어있습니다!");
		}
	}
	
	//요소 삽입
	public int enque(int n) {
		//데이터를 저장하고 있는 노드 생성
		Node_ newNode = new Node_(n); //enque 호출 시 작성한 값으로 데이터부 초기화
		
		//노드가 없을 때 (큐가 비어있을 때)
		//head=null, rear=null
		//노드 1개 삽입 -> 1개 삭제(head 삭제!)
		//첫번째 노드 삽입 - head = newNode
		
		//큐가 비어있을 경우 ->  노드 - front
		if(isEmpty()) { //num <= 0
			front = newNode;
			 
		} else { //큐의 마지막 노드가 다음 노드(새노드) 주소값을 가지게
			rear.linkNode(newNode); //새로운 노드의 주소값이 rear 노드의 주소부에 저장(연결)
		}
		rear = newNode; //새로운 노드가 rear가 되도록 변경
		num++; //요소개수 1증가
		
		return newNode.getData();
	}
	
	//요소 삭제
	public int deque() {
		if(isEmpty()) { //큐가 비어있을 경우 num <= 0
			throw new EmptyQueueException();
		} else {
			int n = front.getData(); //현재 삭제될 노드의 데이터 저장
			Node_ nextNode = front.getNextNode(); //다음에 front가 될 노드의 주소(참조값)을 저장
			
			front = nextNode; //front 노드가 바뀜
			num--; //큐 요소 개수 1 감소
			
			return n;
		}
	}

	//맨 앞 요소 리턴
	public int peek() {
		return front.getData();
	}
	
	//큐가 비어있는지
	public boolean isEmpty() {
		return num <= 0;
	}
}
