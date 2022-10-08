
public class Ex07 {

	public static void main(String[] args) {

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
	}

	public static void getDivisor(int num) {
		
		System.out.print(num + "의 약수 : " );
		
		// 1 ~ num 이 범위	
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				//약수!
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
