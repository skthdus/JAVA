package for문;

public class Ex05 {

	public static void main(String[] args) {
		
		//(77*1) + (76*2) + ... + (1*77)
		
		// 앞에서 곱해지는 숫자 저장 변수
		int down = 77;
		// 뒤에서 곱해지는 숫자 저장 변수
		int up =1;
		
		//누적합 저장 변수
		int sum = 0;
		
		for(int i =1 ; i <= 77 ; i++, down--, up++) { //1~77 i변수 활용 / 77번 반복
			sum += (down*up); //sum = sum+(down*up)
			
		}
			System.out.println(sum);
			
			int sum1 = 0;
			for(int i=1; i<=77; i++) {
				sum1 += ((78-i)*i);
			}
			
			System.out.println(sum);
		}
		
	}


