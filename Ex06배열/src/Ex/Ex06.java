package Ex;

public class Ex06 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1, num2, op));
	}

	private static int cal(int num1, int num2, char op) {
		int answer =0;
		if(op=='+') {
			answer = num1 + num2;
		} else if (op=='-') {
			answer = (num1>num2)? num1 - num2 : num2 - num1;
		} else if (op=='*') {
			answer = num1 * num2;
		} else if (op=='/') {
			answer = num1/num2;
		}
		return answer;

		
	}
		
}
