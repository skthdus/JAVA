package 반복문;

public class Ex02 {

	public static void main(String[] args) {
		
		int a=0; 
		int b =0;
		
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				System.out.print((-1)*i + " ");
				a += (-i);
			}else {
				System.out.print(i + " ");
				b += i;
			}
			
		}
		
		System.out.println("\n결과 : "+ (a+b));

	}

}
