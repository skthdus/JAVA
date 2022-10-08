
public class 피보나치 {

	public static void main(String[] args) {
//		fibo(5) :5번째 항까지 구하겠다
		
		
//		for(int i=1; i<=8; i++) {
//			System.out.print(fibo(i) + " ");
//			}
		
		fiboPrint(7); //fibo() 활용해서 특정항까지 출력
	}
		
	public static void fiboPrint(int n) {
		for(int i = 1 ; i <= n; i++) {
			if(i <= 1) {
					System.out.println(i);
				} else {
					System.out.println(fibo(i-2) + fibo(i-1));
				}
			}
	}
	
	
	//피보나치 수열의 특정 항의 값을 구하는 메서드
	public static int fibo(int n) {
		if(n <= 1) {
			return n;
		} else {
			return fibo(n-2) + fibo(n-1);
		}
	} 
	
	
}
