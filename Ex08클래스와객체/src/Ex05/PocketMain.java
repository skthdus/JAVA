package Ex05;

import java.util.ArrayList;

public class PocketMain {

	public static void main(String[] args) {
		
		Pocketmon mon1 = new Pocketmon("피카츄", "전기", 10, 80, 120);
		
		// mon1.type = "물";
		
		// 내가 원하는 포켓몬 추가하기~
		// mon2, mon3
		Pocketmon mon2 = new Pocketmon("꼬부기", "물", 10, 50, 100);
		Pocketmon mon3 = new Pocketmon("파이리", "불", 15, 60, 110);

		// 배열 : 같은 데이터 타입을 관리하기 위하여 사용하는 기능
		Pocketmon[] mons = new Pocketmon[3]; 
		
		mons[0] = mon1;
		mons[1] = mon2;
		mons[2] = mon3;
		
		// Pocketmon 가방에서 꼬부기 꺼내오기!
		
//		 System.out.println(mons); 
//		 System.out.println(mons[1]);
//		 System.out.println(mons[0].getName()); 
//		 System.out.println(mons[1].getName());
//		 System.out.println(mons[2].getName());

		
		for(int i =0; i < mons.length; i++) {
			System.out.println(mons[i].getName());
			System.out.println(mons[i].getType());
		}
		
		System.out.println();
		
		// 가변배열 (ArrayList) : 크기가 상관없이 계속해서 늘어날 수 있는 배열
		// 1. Pocketmon 타입의 배열의 이름이 pocketList인 가변배열 생성하기
			ArrayList<Pocketmon> pocketList = new ArrayList<>();
		
		// 2. 생성된 가방에 mon1, mon2, mon3 순서대로 담아주기
				pocketList.add(mon1); // 피카츄에 대한 내용
				pocketList.add(mon2); // 꼬부기에 대한 내용
				pocketList.add(mon3); // 파이리에 대한 내용
				
		// 포켓몬 생성과 동시에 가변배열에 추가하는 방법!
				pocketList.add(new Pocketmon("치코리타", "풀", 20, 90, 110));
				
		// 3. 가변배열에 들어있는 포켓몬들의 이름과 타입, lv 출력하기!
			
				for(int i=0; i < pocketList.size();i++) {
					System.out.println((i+1) + " . " + pocketList.get(i).getName() + ", "
										+pocketList.get(i).getType() + " , " 
										+pocketList.get(i).getLv());
					
				}
				

		
	}

}
