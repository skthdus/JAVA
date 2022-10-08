package 큐;

public class LinkedListQueueMain {

	public static void main(String[] args) {

		LinkedListQueue que = new LinkedListQueue();
		
		que.add(5);
		que.add(3);
		que.add(1);
		que.add(4);
		
		System.out.println(que.remove());
		System.out.println(que.peek());
		System.out.println(que.isEmpty());


	}

}
