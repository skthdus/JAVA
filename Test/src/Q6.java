import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		System.out.print("정수입력 : ");
		num = sc.nextInt();
		
		while(num!=0) {
			sum += num%10;
			num/=10;
		}
		System.out.println("각 자리수 합 : " + sum);

	}

}
