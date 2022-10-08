package Ex02;

public class CharacMain {

	public static void main(String[] args) {
		
		// 추상적으로 만들어진 클래스는
		// 미완성되어 있는 클래스로 명확하게 객체 생성을 할 수 없다!
		// -> 추상 클래스는 new 키워드를 사용할 수 없다!

//		Charac ch = new Charac();
//		
//		ch.jump();
//		ch.attack();
//		ch.run();

		System.out.println();
		
		Wizard ch2 = new Wizard();
		ch2.attack();
		ch2.jump();
		ch2.run();
		System.out.println();
		
		Warrior ch3 = new Warrior();
		ch3.attack();
		ch3.jump();
		ch3.run();
		


	}

}
