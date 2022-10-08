package com.smhrd.view;

import com.smhrd.model.Charac;
import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class Test {

	public static void main(String[] args) {
		
		//배열/arraylist안에 춘식, 라이언을 같이 넣을 수 있다
		//배열/arraylisy 기본적으로 같은 타입만 넣을 수 있다.
		
		int[] arr = new int[10]; // 정수형만 들어갈 수 있음
		Chunsik[] css = new Chunsik[4];
		
		//춘식(캐릭터 상속받음) -> 캐릭터 타입으로 바꿀 수 있음(업캐스팅)
		Chunsik cs = new Chunsik();
		cs.printASCII();

		//라이언(캐릭터 상속받음) -> 캐릭터 타입으로 바꿀 수 있음(업캐스팅)
		Ryan r = new Ryan();
		r.printASCII();
		
		
		Object[] cr1 = new Object[2]; 
		cr1[0] =cs; 
		
		Charac[] cr = new Charac[2];
		//업캐스팅은 자동형변환(따로 지정하지 않아도 됨)
		cr[0] = cs;
		cr[1] = r;
		
		cr[0].printASCII();
		
		Chunsik c1 = (Chunsik)cr1[0]; //>다운캐스팅
		c1.printASCII();
		
		//추상클래스로는 절대 객체 생성 불가능 -> 컴파일오류
		//new Charac("a", 20, 20);

	}

}
