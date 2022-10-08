
public class Music {
	
	// 뮤직플레이어에 대한 설게도를 작성하는 Model 부분!
	// Model == Value Object (VO) == Data Transfer Object (DTO)
	
	private String songName;
	private String singer;
	private int playTime;
	
	// 음악 파일의 경로를 저장할 수 있는 필드!
	private String musicPath;
	
	// 생성자 메소드 
	public Music(String songName, String singer, int playTime, String musicPath) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.musicPath = musicPath;
	}
	
	public void getSongName(String songName) {
		this.songName = songName;
	}
	
	public String getsongName() {
		return songName;
	}
	
	public void setSinger() {
		this.singer = singer;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setPlayTime() {
		this.playTime = playTime;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	
	public String getmusicPath() {
		return musicPath;
	}

	

}
