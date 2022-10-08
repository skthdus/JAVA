package 반복문;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		int sum = 0 ;
		
		while(num>0) {
			int a = num%10;
			num/=10;
			
		if(a==1) {
			sum = sum +2 ;
		}	else if(a==7) {
			sum = sum + 3;
		} else if(a==4) {
			sum = sum+4;
		} else if(a==2 || a==3 || a==5) {
			sum = sum+5;
		} else if(a==0 || a==6 || a==9) {
			sum = sum+6;
		} else if(a==8) {
			sum = sum+7;
		}
	}
		System.out.println("대시('-')의 총 합 >> " + sum);
}
		

}

