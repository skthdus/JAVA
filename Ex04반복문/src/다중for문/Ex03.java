package 다중for문;

public class Ex03 {

	public static void main(String[] args) {

		//피라미드 별찍기
		for(int i=1; i<=1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i <=2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=3;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int j =1; j<=5; j++) {
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int j =5; j>=1; j--) {
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<=4; i++) {
			System.out.print("@");
		}		
		for(int i=1; i<=1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=3; i++) {
			System.out.print("@");
		}
		for(int i=1; i<=2; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=2; i++) {
			System.out.print("@");
		}		
		for(int i=1; i<=3; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int j=1;j<=5;j++) {
			//4번반복 ~ 0번반복
			//j=1 i<=4 ( 5-j)
			//j=2 i<=3 
			//j=3 i<=2
			//j=4 i<=1
			//j=5 i<=0
			for(int i=1; i<=(5-j); i++) {
				System.out.print("@");
			}
			//1번반복 ~ 5번반복
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}		
			System.out.println();
		}
	
		
		for(int j =1; j<=5; j++) {
			for(int i=5; i>=1; i--) {
				if(j<i) {
				System.out.print(" ");
				} else
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		/*
		 * System.out.println("*"); 
		 * System.out.println("**"); 
		 * System.out.println("***");
		 * System.out.println("****"); 
		 * System.out.println("*****");
		 */
		
		

	}

}

