package Ex;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println(getMiddle("test"));

	}
	public static String getMiddle(String a) {
		String answer = "";
		
		if(a.length()%2==1) {
			answer = a.substring(a.length()/2,(a.length()/2)+1);
		} else {
			answer = a.substring((a.length()/2)-1,(a.length()/2)+1);
		}
		
		return answer;

	}

}
