package Team;

import java.util.ArrayList;

public class StoreController {
	ArrayList<Store> restaurantList = new ArrayList<>();
	ArrayList<Store> salonList = new ArrayList<>();
	
	int index =0;
	
	public StoreController() {
		restaurantList.add(new Restaurant("혜성식당", "음식점", 75.0, 80.0, 70.0, 90.0));
		restaurantList.add(new Restaurant("정림이네", "음식점", 65.0, 70.0, 75.0, 80.0));
		restaurantList.add(new Restaurant("왕뼈사랑", "음식점", 85.0, 90.0, 55.0, 70.0));
		
		salonList.add(new Salon("박승철", "미용실", 50.0, 70.0, 60.0));
		salonList.add(new Salon("이가자", "미용실", 50.0, 75.0, 65.0));
		salonList.add(new Salon("리안", "미용실", 70.0, 90.0, 70.0));
	}
	
	public void storeShow() {
		System.out.println("====음식점보기====");
		for(int i =1; i<= restaurantList.size(); i++) {
			System.out.println(i+1 + "." + restaurantList.get(2) + " 평점 : " );
		
		}
	
		
		
		}
	
}
	
	

	

