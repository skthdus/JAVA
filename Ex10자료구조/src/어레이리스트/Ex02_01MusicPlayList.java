package 어레이리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_01MusicPlayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<>();

		while(true) {
			System.out.println("[1]노래 추가 [2]노래 삭제 [3]종료");
			int menu = sc.nextInt();
			if (menu==1) { //노래 추가
				printList(musicList);
				System.out.print("[1]마지막 위치 추가 [2]원하는 위치에 추가 >> ");
				int choice = sc.nextInt();
				if(choice==1) {
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					String name = sc.next();
					musicList.add(name);
					
					//musicList.add(sc.next());
					
				}else { //2
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					String name = sc.next();
					System.out.print("추가할 위치 입력 : ");
					int index = sc.nextInt();
					//재생목록 1~
					//arrayList 0~
					musicList.add(index-1,name);
					
				}
				System.out.println("추가가 완료되었습니다!");
			}else if(menu==2) { //노래 삭제
				boolean listEmpty = printList(musicList);
				
				if(!listEmpty) { //비어있지않으면 삭제기능
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					int choice = sc.nextInt();
					if(choice==1) {
						System.out.println("삭제할 노래 선택 : ");
						int delM =sc.nextInt();
						musicList.remove(delM-1);
					}else { //2
						musicList.clear();
					}
					System.out.println("삭제가 완료되었습니다!");
				}
					
			} else { //3 -> 종료
				System.out.println("프로그램 종료!");
				break;
			}
			
		}
		

	}
	
	//musiclist 출력 메서드
	public static boolean printList(ArrayList<String> al) {
		
		//musiclist 비어있는지 비어있지 않은지
		boolean isEmptyList = false;
		
		//현재 재생목록 출력
		System.out.println("======현재 재생 목록======");
		
		//isEmpty() -> boolean(값이 없으면 true 있으면 false)
		if(al.isEmpty()) { //재생목록이 비어있으면
			System.out.println("재생목록이 없습니다");
			isEmptyList = true; // 비어있다
		}else { //재생목록이 비어있지 않으면
			int n=1;
			for(String s:al) {
				System.out.println(n++ + "." + s);
			}
			isEmptyList = false;//비어있지 않다
		}
		System.out.println("=====================");
		
		return isEmptyList;
	}
	
	}
