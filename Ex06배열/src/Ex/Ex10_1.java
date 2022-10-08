package Ex;

public class Ex10_1 {

	public static void main(String[] args) {

		int[] point = {92,32,52,9,81,2,68};

		//가장 거리가 짧은 인덱스 번호 저장
		int index1=0, index2=0;
		//현재까지 제일 짧은 거리 저장
		int len = Math.abs(point[0]-point[1]);
		
		for(int i=0; i<point.length-1;i++) { //기준이 되는 인덱스 번호(0~5)
			for(int j=i+1; j<point.length; j++) { //i+1 ~6
				if(Math.abs(point[i]-point[j])<len){ //i,j 인덱스의 값의 차(거리)가 제일 짧은 경우
					len = Math.abs(point[i]-point[j]);
					index1 = i;
					index2 = j;
				}
			}
		}
				System.out.println("result = [" + index1+"," +index2 + "]");
		

	}

}
