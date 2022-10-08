package Ex03;

public abstract class Employee {
	
	//모든 직급에 대하여 공통적인 내용을 관리할 수 있는 설계도!
	
	// protected로 지정된 필드들은 상속을 받은 관계에서만 
	// 접근할 수 있는 필드가 된다!
	protected String empno;
	protected String name;
	protected int pay;

	// 급여 계산 할 수 있는 메소드 -> 계급별로 다른 계산식 사용!
	public abstract int getMoneyPay();
	
	// 정보를 출력할 수 있는 메소드
	public String print() {
		return empno + " : " + name + " : "+ pay;
	}
}
