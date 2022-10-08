package Ex;

public class Ex03 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		
		int num =1;
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				arr[j][i]= num++;
			}
		
		}
		for (int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
		System.out.print(arr[i][j] + " ");
	}
			System.out.println();

}
}
}
