package 트리;

public class TreeMain {

	public static void main(String[] args) {


		Tree tree = new Tree();

		tree.addNode(4);
		tree.addNode(2);
		tree.addNode(3);
		tree.addNode(6);
		tree.addNode(1);
		tree.addNode(8);
		
		tree.preOrderTree(tree.getRootNode());
		tree.inOrderTree(tree.getRootNode());
		tree.postOrderTree(tree.getRootNode());
	}

}
