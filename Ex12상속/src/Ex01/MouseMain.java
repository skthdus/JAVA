package Ex01;

public class MouseMain {

	public static void main(String[] args) {
		
		// Mouse 설계도를 통하여 mouse 객체 생성하기
		Mouse mouse = new Mouse();
		
		mouse.leftClick();
		mouse.rightClick();
		
		System.out.println();
		
		// WheelMouse 객체 생성
		WheelMouse wm = new WheelMouse();
		
		wm.leftClick();
		wm.rightClick();
		wm.wheel();
		
		System.out.println();
		
		// SmartMouse 객체 생성
		SmartMouse sm = new SmartMouse();
		sm.leftClick();
		sm.rightClick();
		sm.wheel();
		sm.smart();

	}

}
