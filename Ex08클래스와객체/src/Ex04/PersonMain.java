package Ex04;

public class PersonMain {

	public static void main(String[] args) {
		
		// 1. Person의 default 생성자를 사용하여 객체 생성
		Person person1 = new Person();
		
		// 2. person1의 이름과 나이 초기화
		person1.setName("홍길동");
		person1.setAge(25);
		
		
		// 3. 2개의 매개변수를 넘겨받아 새로운 객체 person2 생성	
		Person person2 = new Person("김영희", 27);
		
		// 4. 출력 
		System.out.println("person1의 이름 : "+person1.getName()+", 나이 : " + person1.getAge());
		System.out.println("person2의 이름 : "+person2.getName()+ ", 나이 : "+ person2.getAge());

	}

}
