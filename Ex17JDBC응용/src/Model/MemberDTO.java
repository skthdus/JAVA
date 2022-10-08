package Model;

public class MemberDTO {
	
	// Model -> VO(Value Object) -> DTO(Data Transfer Object)
	
	// 회원관리를 위한 설계도
	private String id;
	private String pw;
	private String nick;
	private int age;
	
	// id
	// id, nick 
	// id, pw, nick, age
	
	// Select 기능 사용시 ArrayList에 담을 id, nick을 하나의 생성자로 만들기!
	public MemberDTO(String id, String nick) {
		this.id = id;
		this.nick = nick;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNick() {
		return nick;
	}
	

}
