package Ex03;

public class RegularEmployeeMain {

	public static void main(String[] args) {
		
		// 객체를 생성하는 키워드 -> new
		// new -> 키워드 사용과 동시에 생성자 메소드를 호출할 수 있는 기능!
		
		RegularEmployee regular = new RegularEmployee("SMHRD001", "홍0동", 4000, 400);
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay()+"만원");

		System.out.println();
		
		TempEmployee temp = new TempEmployee("SMHRD002","채수민",3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay()+"만원");
	
		System.out.println();
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003", "김O독", 10, 10);
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay() + "만원");
		
	}

}
