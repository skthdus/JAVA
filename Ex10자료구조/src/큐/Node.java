package 큐;

public class Node {

	//데이터
	private int data;
	//다음 노드의 주소
	private Node nextNode;
	
	public Node(int n) {
		data = n;
		nextNode = null;
	}
	
	//노드의 데이터를 가지고 오기
	public int getData() {
		return data;
	}
	
	//해당 노드와 연결되어 있는 노드(주소, 참조값) 가지고 오기
	public Node getNextNode() {
		return nextNode;
	}
	
	//현재 생성된 노드가 이전에 top노드의 주소값을 가지고 있도록 (연결)
	public void linkNode(Node first) { //first : 현재 탑노드의 주소
		nextNode =first;
	}

	
}
