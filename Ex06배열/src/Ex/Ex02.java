package Ex;

public class Ex02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		boolean result = inDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}
	
	public static boolean inDivide(int num1, int num2) {
		if(num1 % num2==0) {
			return true;
		}else {
			return false;
		}
	}
	

}
