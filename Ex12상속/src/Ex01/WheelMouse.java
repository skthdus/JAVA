package Ex01;

public class WheelMouse extends Mouse {
	
	// 공통되는 기능은 이미 만들어져있는 클래스로 부터 물려받기! -> 상속
	// 상속의 키워드! extends
	

//	// 왼쪽 클릭 기능
//	public void leftClick() {
//		System.out.println("좌 클릭~~");
//	}
//	
//	// 오른쪽 클릭 기능
//	public void rightClick() {
//		System.out.println("우 클릭~~");
//	}
	
	// 휠 사용 기능
	public void wheel(){
		System.out.println("휠 사용하기~~~");
	}
}
