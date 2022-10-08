package 트리;

public class Node {
	private int data; //실제 데이터 저장 공간
	private Node leftNode; //왼쪽에 붙을 노드 참조값 저장
	private Node rightNode; //오른쪽에 붙을 노드 참조값 저장
	
	//생성자
	public Node(int data) {
		this.data = data;
		leftNode = null;
		rightNode = null;
	}
	
	//데이터부 값 가지고오기
	public int getData() {
		return data;
	}
	
	//왼쪽 연결 노드 설정
	public void setLeftNode(Node left) {
		this.leftNode = left;
	}
	
	//왼쪽 연결 노드 참조값 가지고 오기
	public Node getLeftNode() {
		return leftNode;
	}
	
	//오른쪽 연결 노드 설정
	public void setRightNode(Node right) {
		this.rightNode = right;
	}
	
	//오른쪽 연결 노드 참조값 가지고 오기
	public Node getRightNode() {
		return rightNode;
	}
}
