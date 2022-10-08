package Ex;

public class Ex11 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num=0;
		
		for(int i=0; i<arr.length;i++) {
			for (int j =0;j<arr.length; j++ ) {
				num++;
			}
			System.out.print(num + " ");
		}
		 System.out.println();
	}

}
