package Ex_static;

public class A {

	public static void main(String[] args) {
		// static(정적) / Heap 
		
		test01();
		
		A a = new A();
		a.test02(); 
		
		B b= new B(); 
		b.test03();
		B.test03();
		b.test04();
		

	}
	
	public static void test01() {
		System.out.println("static이 있는 test01 메소드");
	}
	
	public void test02() {
		System.out.println("static이 없는 test02 메소드");
	}

}
