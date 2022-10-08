package Ex03;

public class studentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.number = "20150675";
		student1.age = 22;
		student1.scoreJava = 50;
		student1.scoreWeb = 89;
		student1.scoreAndroid = 77;
		
		Student student3 = new Student("홍길동", "20150675", 22, 50,89,77);
		
		Student student2 = new Student();
		student2.name = "김영희";
		student2.number = "20090541";
		student2.age = 29;
		student2.scoreJava = 90;
		student2.scoreWeb = 25;
		student2.scoreAndroid = 30;

		student1.show();
		student2.show();
		student3.show();
	}

}
