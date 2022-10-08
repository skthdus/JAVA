package 다중for문;

public class Ex01 {

	public static void main(String[] args) {


		//구구단 2단
		
		/*
		 * System.out.println("2 * 1 = " + (2*1)); 
		 * System.out.println("2 * 2 = " +(2*2)); 
		 * System.out.println("2 * 3 = " + (2*3)); 
		 * System.out.println("2 * 9 = " + (2*9));
		 */
		
		
		System.out.println("==2단=="); 
		for(int i=1 ;i<=9;i++) {
		System.out.printf("2 * %d = %d\n",i, 2*i); }
		 
		
		System.out.println("==3단==");
		for(int i=1 ;i<=9;i++) {
			System.out.printf("3 * %d = %d\n",i, 3*i);
		}
		
		System.out.println("==4단==");
		for(int i=1 ;i<=9;i++) {
			System.out.printf("4 * %d = %d\n",i, 4*i);
		}

		//2~9단까지 출력 반복문
		//for문 혹은 while문(반복문) 중첩해서 쓸 수 있다!
		
		for(int i=2 ; i<=9; i++) {
			System.out.print( i +"단 : \t"); // \t:tab
			for(int j=1 ;j<=9;j++) {
				System.out.printf("%d * %d = %d\t",i,j, i*j);
			}
			System.out.println();
		}
	}

}
