package 다중for문;

public class Ex05 {

	public static void main(String[] args) {
		
		
		
		for(int j =1 ; j<=1000;j++) {
			int sum = 0;
			//약수 합 구하는 반복문
			for(int i =1; i<=j/2 ; i++) {
				if(j%i==0) {
				sum+=i; //자기자신을 제외한 약수들의 합
			}
			
		}
		 if(j==sum) {
			 System.out.println(j);
		 }
		}
		

	}
}


