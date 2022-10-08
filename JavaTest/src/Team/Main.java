package Team;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StoreController src = new StoreController();
		
		
		int menu =0;
		int index = 0;
		while(true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			menu = sc.nextInt();
			if(menu == 1) {
				src.storeShow();
			} else if(menu ==2 ) {
				
			} else if (menu ==3) {
				
			} else if (menu ==3 ) {
				
				
			} else if(menu ==4) {
				
			} else if(menu == 5) {
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}
		}

	}


}
