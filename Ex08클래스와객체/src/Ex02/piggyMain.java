package Ex02;

public class piggyMain {

	public static void main(String[] args) {

		// 설계도에 의한 piggy 객체 생성
		PiggyBank piggy = new PiggyBank();
		
		// piggy 객체의 money 속성에 1500원 적금하기
		piggy.deposit(1500);
		
		// piggy객체의 money 속성에 700원 적금하기
		piggy.deposit(700);
		
		// 현재까지의 입금액 확인하기
		piggy.showMoney();
		
		piggy.withdraw(500);
		
		piggy.showMoney();

		
		
		PiggyBank piggy2 = new PiggyBank();
		piggy2.deposit(1000);
		
		System.out.println();
		System.out.print("piggy ");
		piggy.showMoney();
		System.out.print("piggy2 ");
		piggy2.showMoney();
	
	
	}
}
