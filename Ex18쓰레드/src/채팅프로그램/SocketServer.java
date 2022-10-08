package 채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SocketServer extends Thread {
	
	static ArrayList<Socket> list = new ArrayList<Socket>(); //유저 확인용
	static Socket socket = null; //현재 접속한 유저 임시 저장공간

	public SocketServer(Socket socket) { //소켓 넘버 등 정보를 넘기면서 서버소켓을 생성
		this.socket = socket; //클라이언트가 접속시 소켓을 생성 및 저장
		list.add(socket); //클라이언트를 리스트에 추가		
	}
	
	public void run() {
		
		try {
			//서버 콘솔에 출력
			System.out.println(socket.getInetAddress() + "ip의 클라이언트와 연결 ");
			
			//클라이언트가 보낸 메세지 읽어들일 통로(스트림)
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			//서버에서 클라이언트에게 메세지 보내는 통로(스트림)
			//현재 접속한 클라이언트한테만 연결되어 있는 통로
			OutputStream out = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(out, true);
			
			writer.println("서버에 연결되었습니다! 사용할 닉네임을 입력하세요!");
			
			//클라이언트가 내용을 입력하는 것은 반복 
			//1. 최초로 입력한 값은 닉네임으로 저장
			//2. 그다음부터 입력한 값은 채팅내용이므로 다른 사용자에게 출력
			
			String nick = null; //클라이언트가 작성한 닉네임 저장용
			String readValue; //클라이언트가 입력한 값을 저장(채팅내용/닉네임)
			boolean check = false; //false-사용자가 최초로 입력하기 전 / true-닉네임을 입력한 후
			
			while((readValue = reader.readLine()) != null) { //사용자가 입력한 값이 있을 경우
				if(check == false) { //사용자가 입력한 내용을 nick 변수에 저장
					nick = readValue;
					check = true; //그 다음부터 입력한 값은 채팅내용으로 출력하도록!
					writer.println(nick + "님이 접속하셨습니다!");
				} else { //닉네임을 입력한 경우
					for(Socket s : list) {
						out = s.getOutputStream(); //채팅작성자 외에 다른 사용자와 연결할 스트림
						writer = new PrintWriter(out, true);
						writer.println(nick + " : " + readValue);
					}
				}
				
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		try {
			int socketPort = 1234; //소켓포트 설정
			ServerSocket serverSocket =  new ServerSocket(socketPort); //서버 소켓 만들기(서버 열기)
			
			//서버가 종료될 때까지 클라이언트가 접속하면은 클라이언트 정보(소켓) list안에 저장
			while(true) {
				Socket socketUser = serverSocket.accept(); //접속한 클라이언트 받기
				SocketServer socketServer = new SocketServer(socketUser);
				socketServer.start(); //멀티쓰레드 동작(run 호출x)
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	

}
