package 큐;

public class ArrayQueueMain_ {

	public static void main(String[] args) {
		
		ArrayQueue_ aq= new ArrayQueue_(5);
		
		aq.enque(1);
		aq.enque(2);
		aq.enque(3);
		aq.enque(4);
		aq.enque(5);
		
		System.out.println(aq.deque()); //선입선출
		System.out.println(aq.deque());
		System.out.println(aq.deque());
		
		System.out.println(aq.peek());
	}

}
