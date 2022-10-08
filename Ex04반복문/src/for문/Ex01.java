package for문;

public class Ex01 {

	public static void main(String[] args) {
		
		//System.out.println(1);
		//System.out.println(2);
		//System.out.println(3);
		//System.out.println(4);
		//System.out.println(5);
		
		//for(int i=1; i<=5 ; i++ ) { //반복문을 5번 반복
			//System.out.println(i);
		//}
		
		
		for(int i =21; i<=57; i++) {
			System.out.println(i);
		}
		
		for(int i=96; i>=53; i--) {
			System.out.println(i);
		}
		
		for(int i=21; i<=57; i++) { // for(int i =21; i<=57;i+=2)
			if(i%2==1) {
				System.out.println(i);
			}
		}



	}

}
