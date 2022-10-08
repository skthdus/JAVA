package Ex01;

public class Person {

	// Person 객체를 만들기 위한 설계를 진행 하는 설계도!
	// 설계도는 설계만 진행하므로 실행되는 과정은 가질 수 없다!
	// -> main() X
	
	// 설계도 -> class
	// class 구조!
	// 1. 필드 = 속성, 데이터, 특징
	
	int age = 10 ;
	String gender;
	int height; 
	int weight;
	
	// 2. 메소드 = 행위, 로직, 기능
	
	public void move() {
		System.out.println("뚜벅뚜벅 걷는다...");
	}
	
	public void eat() {
		System.out.println("우걱우걱 먹는다!");
	}
	
	
	
	// 사람이라면 어떤 특징과 어떤 행위를 가져야 할까..?
	// 키, 몸무게, 다리, 이름, 생김새, / 자기, 먹기, 움직임
	
	
	
	
}
