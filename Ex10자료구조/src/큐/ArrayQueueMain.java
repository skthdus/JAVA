package 큐;

public class ArrayQueueMain {

	public static void main(String[] args) {

		ArrayQueque aq = new ArrayQueque(5);
		
		aq.add(3);	
		aq.add(2);	
		aq.add(1);	 
		aq.add(5);	
		aq.add(4);
		
		System.out.println(aq.remove()); 
		System.out.println(aq.peek());	
		System.out.println(aq.isEmpty());
		System.out.println(aq.isFull());


	}

}
