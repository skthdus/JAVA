package Ex02;

public class BurgerMain {

	public static void main(String[] args) {
		
		Burger burger = new Burger();
		
		CheeseBurger cheese = new CheeseBurger();
		
		burger.make();
		cheese.cheesemake();
		
		System.out.println();
		
		Burger b1 = new CheeseBurger();
		b1.make();
		
		System.out.println();
		
//		CheeseBurger c1 = (CheeseBurger) b1;
		cheese.make();
		cheese.cheesemake();
	
	}

}
