import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {
	// Controller 역할을 할 수 있는 클래스!
	// Model과 View를 연결하는 목적!
	
	// 4개의 곡을 담을 수 있는 ArrayList 생성!
	ArrayList<Music> musiclist = new ArrayList<>();
	
	// 노래를 재생하거나 정지할 수 있는 기능 불러오기!
	MP3Player mp3 = new MP3Player();
	
	// musiclist에 있는 노래 순서를 관리할 수 있는 변수 생성
	int index =0;
	
	// Controller가 호출 되자마자 세팅되어 있는 mp3를 사용할 수 있도록
	// Controller용 생성자 메소드를 만들어 노래정보 저장하기!
	
	public MusicController() {
		musiclist.add(new Music("라일락", "아이유", 40, "music/lilac.mp3"));
		musiclist.add(new Music("On the ground", "로제", 90, "music/on the ground.mp3"));
		musiclist.add(new Music("peaches", "저스틴비버", 10, "music/peaches.mp3"));
		musiclist.add(new Music("rollin", "브레이브걸스", 117, "music/rollin.mp3"));
	}

	public void play() {
		// 노래 재생을 위한 메소드
		// 호출 시 musiclist에 있는 노래를 play!
		
		if(mp3.isPlaying()) { // 실행되는 노래가 있다면 멈추고 다시 재생!
			mp3.stop();
		}
		
		mp3.play(musiclist.get(index).getmusicPath());
//		mp3.play("music/lilac.mp3");
		show();
	}
	
	public void stop() {
		mp3.stop();
	}
	
	// 다음 곡 재생을 위한 메소드
	public void next() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
		// index 번호가 3일 때 다시 0으로 돌아갈 수 있는 작업 진행!
		if(index < musiclist.size()-1) {
			index++;
		} else {
			// 마지막 인덱스에서 다시 다음버튼을 눌렀을 경우!
			index = 0;
		}
		
		mp3.play(musiclist.get(index).getmusicPath());
		show();
	}
	
	// 선택시 이전으로 노래를 play하는 기능 만들기!
	public void pre() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
		if(index > 0) {
			index--;
		} else {
			index = musiclist.size()-1;
		}
		
		mp3.play(musiclist.get(index).getmusicPath());
		show();
	}

	public void show() {
		System.out.println(musiclist.get(index).getsongName() 
							+ " - " + musiclist.get(index).getSinger());
	}
}
