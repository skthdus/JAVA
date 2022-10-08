package 큐;

public class Node_ {

	private int data; //실제 데이터 저장
	private Node_ nextNode; //연결된 노드의 주소 (다음에 추가될 노드의 주소)
	
	//생성자
	public Node_(int data) {
		this.data = data;
		this.nextNode = null; //노드만 생성했을 경우에는 큐에
							  //연결된 상태가 아님!
	}
	
	//this 노드가 rear일때 새로운 노드가 연결이 될 때 그 노드의 주소값을 저장
	public void linkNode(Node_ next) {
		this.nextNode = next;
	}
	
	//this 노드의 데이터 가지고 오기
	public int getData() {
		return data;
	}
	
	//this 노드에 저장된 next노드의 주소값 가지고오기
	public Node_ getNextNode() {
		return nextNode;
	}
	
	
}
