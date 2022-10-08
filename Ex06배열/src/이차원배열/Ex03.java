package 이차원배열;

public class Ex03 {

	public static void main(String[] args) {


		int[][] arr= new int[5][5];
		
		int num=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
			arr[i][(arr.length-1)-j] = num++;
			}
		}
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		int[][] arr2 = new int[5][5];
		int num2 = 1;
		
		for(int i=0;i<arr2.length;i++) {
			if(i%2==0) { //행 인덱스가 짝수
			for(int j=0;j<arr2.length;j++) {
				arr2[i][j] = num2++;
			}
				
			} else { //행 인덱스가 홀수
				for(int j=0;j<arr2[i].length;j++) {
					arr2[i][arr2.length-1-j] = num2++;
				}
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
}

	}

