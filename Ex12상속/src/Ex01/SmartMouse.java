package Ex01;

public class SmartMouse extends WheelMouse {

	// 좌 클릭
	// 우 클릭
	// 휠 기능
	// + SmartMouse만이 가질 수 있는 기능
	//	피로를 감소시키는 기능 -> smart()
	
	public void smart() {
		System.out.println("피로 감소~~");
	}
	
	// 물려받기 하였으나 나만의 기능으로 사용할 수 있는 기능 만들기
	// -> 재정의 의미! (메소드 오버라이딩)
	// -> 상속을 받는 관계에서 메소드에 대하여 재정의를 하는 것!
	public void leftClick() {
		System.out.println("더블 좌클릭~~");
		
	}
	
	public void rightClick() {
		System.out.println("더블 우클릭~~");
	}
}
