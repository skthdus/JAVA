package Ex;

import java.util.Arrays;
import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		//뽑을 번호 저장
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length ; i++) {
			lotto[i]=rd.nextInt(45)+1;
			
			//이전에 뽑은 값과 지금 뽑은 값이 일치한지 확인(중복체크)
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					//다시뽑게 -> i번째 숫자를 다시 뽑는다!!!
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}
		}


