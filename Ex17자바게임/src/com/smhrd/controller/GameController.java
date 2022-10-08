package com.smhrd.controller;

import com.smhrd.model.Charac;
import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class GameController implements GameInterface{

	@Override
	public void printMenu() {
		System.out.print("[1]내 캐릭터 생성 [2]전투모드 [3]내 캐릭터 확인 [4] 종료 ");
		
	}

	//내 캐릭터 생성
	@Override
	public Charac myCharac(int select) {
		
		//1번 선택 -> 라이언 객체 생성
		//2번 선택 -> 춘식이 객체 생성
		//생성된 캐릭터 반환
		
		Charac cha = null; //라이언/춘식 생성된 객체 담을 용도
		
		if(select ==1 ) {
			//라이언 객체 생성
//			Ryan ry = new Ryan();
//			cha = ry;
			cha = new Ryan(); //업캐스팅(자동형변환)
		} else if (select ==2 ) {
			//춘식 객체 생성
//			Chunsik chun = new Chunsik();
//			cha = chun;
			cha = new Chunsik(); //업캐스팅(자동형변환)
		}
		//생성된 캐릭터의 아스키아트 출력
		cha.printASCII();

		//생성된 객체 반환
		return cha;
	}

	@Override
	public Charac oppCharac(Charac myCharac) {
		//내 캐릭터 어떤 타입인지
		//myCharac가 원래 라이언 타입이었니? 
		//원래 라이언 -> true
		//원래 라이언타입이 아니었다 -> false
		
		Charac oppC = null;
		
		if(myCharac instanceof Ryan) {
			//춘식이 생성
			oppC = new Chunsik();
			System.out.println("야생의 춘식이가 나왔습니다!");
		} else if(myCharac instanceof Chunsik) {
			//라이언 생성
			oppC = new Ryan();
			System.out.println("야생의 라이언이 나왔습니다!");
		}
		
		return oppC;
	}

	//한번의 공격 - 방어
	//한 캐릭터라도 죽은 경우에는 -> false
	//계속 전투를 할 수 있는 경우(아무도 죽지 않은 경우)에는 -> true
	@Override
	public boolean battle(Charac myC, Charac oppC, int ad) {
		//1. 사용자가 1 -> 공격
		//내 캐릭터는 상대방을 공격, 상대방은 방어
		//2. 사용자가 2 -> 방어
		//상대방은 내 캐릭터를 공격, 내 캐릭터는 방어
		
		//내 캐릭터의 체력(hp)와 상대방 캐릭터의 체력(hp)을 출력
		
		int hp = 0;
		
		if(ad == 1) { //내 캐릭터가 공격
			myC.attack(oppC);
			oppC.defence();
		} else if (ad == 2) {
			oppC.attack(myC);
			myC.defence();
		}
		
		System.out.println("내 캐릭터 HP : " + myC.getHp());
		System.out.println("상대 캐릭터 HP : " + oppC.getHp());
		
		//1. 내 캐릭터가 죽었는지(myC HP <= 0)
		//내 캐릭터의 경험치를 -10 감소
		//전투 종료
		

		//2. 상대방 캐릭터가 죽었는지(oppC HP <= 0)
		//내 캐릭터의 경험치를 +10 증가
		//만약에 경험치를 10 증가시킨 후 내 경험치가 30이상이 되면
		//		 -> 레벨 1증가
		
		boolean cont = true; //전투를 계속 할 수 있는지 없는지
		
		if(myC.getHp()<=0) {
			if(myC.getXp()>=10) {
				myC.setXp(myC.getXp()-10);
			} else { //경험치가 10보다 작을 때는 무조건 0으로 수정
				myC.setXp(0);
			}
			System.out.println(myC.getType()+ "이 죽었습니다!");
			cont = false;
		} else if(oppC.getHp()<=0) {
			myC.setXp(myC.getXp() + 10);
			
			if(myC.getXp()>=30) {
				myC.levelUp();
			}
			System.out.println(oppC.getType() + "이 죽었습니다!");
			cont = false;
		}

		//캐릭터 중 하나라도 죽은 캐릭터가 있으면 false 반환
		//죽은 캐릭터가 없으면 true 반환
		
		return cont;
	}
		

	//내 캐릭터 현재 상태 출력
	//타입, hp, xp, atk ...
	@Override
	public void checkMyC(Charac myC) {
		System.out.println("내 캐릭터 타입 : " + myC.getType());
		System.out.println("내 캐릭터 레벨 : " + myC.getLevel());
		System.out.println("내 캐릭터 HP : " +  myC.getHp());
		System.out.println("내 캐릭터 XP : " +  myC.getXp());
		System.out.println("내 캐릭터 공격력 : " +  myC.getAtk());
		System.out.println("내 캐릭터 방어력 : " +  myC.getDef());
					
	}
		
}
