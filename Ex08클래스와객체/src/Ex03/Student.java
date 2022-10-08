package Ex03;

public class Student {
	// 학생정보를 관리하기 위한 설계도
	
	// 학생정보를 저장하기 위한 필드
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;

	// 기본 생성자 메소드 -> 생략되어 있다.
	public Student() {
		
	}
	
	// 생성자 메소드 오버로딩(중복정의)
	public Student(String name, String number, int age,
			int scoreJave, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	
	// 학생정보를 보여주기 위한 메소드
	public void show() {
	System.out.println(name + "님 안녕하세요.");
	System.out.println("[ " + number +", " + age + "살 ]");
	System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
	System.out.println(name + "님의  Web점수는 " + scoreWeb + "점 입니다.");
	System.out.println(name + "님의  Android점수는 " + scoreAndroid + "점 입니다.");
	System.out.println("=================================================");
}
} 
