package 쓰레드활용;

//동시에 여러 개 스킬 쓸 수 있음
//멀티쓰레드
//2. Runnable 인터페이스 구현
//확장성이 좋음, 다른 클래스 상속, 인터페이스 구현
public class Ari2 implements Runnable{
	
	private String skill;
	
	public Ari2(String key) {
		skill = key;
	}

	@Override
	public void run() {
		System.out.println("입력 키 : " + skill);
		//3초간 스킬 지속(카운팅)
		for(int i=1; i<=3; i++) {
			System.out.println(skill + "스킬 사용 중 : "+ i +"s");
		}
		System.out.println(skill + "스킬 사용 종료");
	}
}
