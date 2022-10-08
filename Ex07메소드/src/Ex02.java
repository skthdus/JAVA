
public class Ex02 {

	public static void main(String[] args) {
		
		
		   add(3, 5); 
		   sub(3, 5); 
		   mul(3, 5);
		   div(3, 5);
		  
		 
		/*
		 * System.out.println(result1); 
		 * System.out.println(result2);
		 * System.out.println(result3); 
		 * System.out.println(result4);
		 */
		
	}
	
	//메소드 연산에 대한 결과값은 메소드 내에서 출력할 수 있도록 하시오
	
	// add(int num1, int num2)
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	// sub(int num1, int num2)
	public static void sub(int num1, int num2) {
		//큰 수에서 작은 수를 뺄 수 있도록 수정!
		int result = num1>num2? num1 - num2 : num2 - num1;
		System.out.println(result);
	}
	// mul(int num1, int num2)
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	// div(int num1, int num2)
	public static void div (int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
