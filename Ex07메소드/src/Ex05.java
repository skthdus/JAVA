
public class Ex05 {
	
	public static void main(String[] args) {
		int num1 = 8 ;
		int num2 = 12;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
		
	}
	
	public static int close10(int num1, int num2) {
	
		// 10과의 거리 차를 기억할 수 있는 변수 선언
		/*
		 * int a= 10-num1; 
		 * int b= 10-num2;
		 */
		
		// 거리의 차가 음수가 나오지 않도록 절대값 작업 진행
		
		/*
		 * if(a < 0) { 
		 * a *= -1; 
		 * } if (b < 0) { 
		 * b *= -1; 
		 * }
		 */
		
		int a = Math.abs(10-num1);
		int b = Math.abs(10-num2);
		
		// 10과의 거리가 어느 수가 더 가까운지 판단하기!
		if(a > b) {
			return num2;
		} else if(a < b) {
			return num1;
		} else {
			return 0;
			
		}
		
	}

}
