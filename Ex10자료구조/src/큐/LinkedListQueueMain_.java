package 큐;

public class LinkedListQueueMain_ {

	public static void main(String[] args) {

		LinkedListQueue_ llq = new LinkedListQueue_();

		llq.enque(1);
		llq.enque(2);
		llq.enque(3);
		llq.enque(4);
		llq.enque(5);
		llq.enque(6);
		
		System.out.println(llq.deque());
		System.out.println(llq.deque());
		System.out.println(llq.deque());
		
		System.out.println(llq.peek());

	}

}
