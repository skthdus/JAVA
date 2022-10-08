
public class Ex08 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		boolean divisor = inDivisor(num1, num2);
		
		System.out.println(divisor);

	}

	public static boolean inDivisor(int num1, int num2) {
		
		if(num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	

}
