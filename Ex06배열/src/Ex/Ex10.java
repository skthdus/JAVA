package Ex;

public class Ex10 {

	public static void main(String[] args) {
		
		int[] point = {92,32,52,9,81,2,68};
		
		int min = Math.abs(point[0]-point[1]);
		
		int[] arr = new int[2]; 
		
		
		for(int i=0; i<point.length;i++) {
			for (int j= i+1; j < point.length; j++) {
				
				int length = point[i]-point[j];
				length = Math.abs(length);
				
				if(length< min) {
					min = length;
					
					arr[0]=i;
					arr[1]=j;
					
				}
				
			}
			
		}
		System.out.printf("result = [%s, %s]",arr[0], arr[1]);
	}

}
