import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("나이 >> ");
		
		int age = sc.nextInt();
		
		if(age<=40) {
			System.out.println("초년입니다.");
		} else if(age<=60) {
			System.out.println("중년입니다.");
		} else {
			System.out.println("노년입니다.");
		}
	}

}
