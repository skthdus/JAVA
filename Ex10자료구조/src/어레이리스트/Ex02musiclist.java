package 어레이리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02musiclist {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();

		
		for (int i=0; ;i++) {
		System.out.print("[1] 노래 추가 [2] 노래 삭제 [3] 종료 >> ");
		int select = sc.nextInt();
		
		int add = 0;
		String name;
		int num =1;
		int del =0;
		int num2 =0;
		
		System.out.println("======== 현재 재생 목록 ========" );
		if(select==1) {
			if(al.size()==0) {
				System.out.println(" 재생 목록이 없습니다. ");
			} else {
				for (String st : al) {
				System.out.println(num++ + "." + st );
				
				}
				}
			System.out.println("============================");
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				add = sc.nextInt();
			
				if(add==1) {
				System.out.print("추가 할 노래 입력 : ");
				name = sc.next();
				al.add(name);
				System.out.println("추가가 완료 되었습니다");
				System.out.println();
			} else {
				System.out.print("추가 할 노래 입력 : ");
				name = sc.next();
				System.out.print("추가 할 위치 입력 : ");
				num = sc.nextInt();
				al.add((num-1),name);
			}
		} else if(select==2) {
			
			if(al.size()==0) {
			System.out.println(" 재생 목록이 없습니다. ");
			break;
			} else {
				for (String st : al) {
					System.out.println(num++ + "." + st );
				
				}
			System.out.println("======================");
			System.out.print("[1]선택삭제 [2]전체삭제 >> ");
			del = sc.nextInt();
			
			if(del==1) {
				System.out.print("삭제할 노래 선택 >> ");
				num2 = sc.nextInt();
				al.remove(num2-1);
				System.out.println("노래가 삭제되었습니다.");
			} else {
				al.clear();
				System.out.println("전체list가 삭제되었습니다");
			}
			
		} 
	}else {
			System.out.println("프로그램이 종료되었습니다.");
			break;
}
}
}
}
