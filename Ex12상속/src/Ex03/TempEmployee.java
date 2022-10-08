package Ex03;

public class TempEmployee extends Employee{
	
		
	public TempEmployee(String empno, String name, int pay) {
		//super(); -> 상속의 의미에서 부모가 되는 클래스를 지치하는 키워드
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		return pay/12;
	}
	
}
