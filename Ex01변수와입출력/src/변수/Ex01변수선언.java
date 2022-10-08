package 변수;

//인코딩(한글,영문,한자,일본어 -> 기계어)방식 (UTF-8, EUC-KR) 설정

//EUC-KR : (완성형) 강 -> 강
//UTF-8 : (조합형) 강 -> ㄱ ㅏ ㅇ

public class Ex01변수선언 {

	public static void main(String[] args) {

		// ctrl + /, 여러 줄 - ctrl + shift + /
		// 주석(코드에 영향을 미치지 않음 - 코드에 대한 설명 작성)
		// 변수: 데이터를 담을 수 있는 공간(값 변경 가능)
		// 변수 선언 ( 자료형 변수이름; )
		// 자료형 : 변수에 담을 자료의 형태(정수형, 실수형, 문자형, 논리형)
		int num;

		// 변수이름 : 예약어는 사용 불가능
//		int class;

		// 값 할당
		num = 3;

		// alt + shift + r : 변수 일괄 변경
		// ctrl + shift + f : 코드 정렬
		
		int num6 = 3;
		num6 = 5; // 새로운 값 할당
		// ctrl + alt + 방항키(위,아래) : 코드 복사
		// alt + 방향키(위,아래) : 코드 순서 바꾸기(위,아래)
		num6 = 5; // 새로운 값 할당
		num6 = 7;

		//상수선언 : 값 변경 불가능, final 키워드 사용
		final int num5 = 10;
		//num5 = 12;
		
		
		
		
		
	}

}
