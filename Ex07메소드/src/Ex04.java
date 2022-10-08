
public class Ex04 {


	public static void main(String[] args) {

		int base = 10;
		int n =2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}
	
	public static int powerN(int base, int n) {
		
		//첫번째 지수 계산시 자기 자신으로부터 시작할 수 있도록 
		// 새로운 변수 사용
		/*int result=1;
		
		for(int i=1; i<=n; i++) {
			result *= base;
			//result = base * result;
		}
		return result;*/
		
		return (int)Math.pow(base, n);
}
	}
