package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_Select {

	public static void main(String[] args) {

		// JDBC 연결순서
		// 0. (선행작업) 프로젝트에 ojdbc6.jar 파일 연결
		// 1. JDBC 드라이버 연결
		// 2. 데이터베이스 연결
		// 3. SQL문 작성 및 전송
		// 4. 객체 연결 종료
		
		// 객체 생성 및 선언
		Connection conn =null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		
		// try : 예외 처리를 진행 할 수 있는 구문!
		// catch : try 실행 시 발생하는 오류를 catch문을 통해 해결할 수 있다
		try {
			// 1. JDBC 드라이버 연결
			// Class.forName() : 드라이버 연결에 필요한 클래스 찾아오기!
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결 -> Connection 객체 필요!
			// 데이터베이스에 연결하기 위한 필요 정보! (DB주소, 아이디, 비밀번호)
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			//  접속이 잘 됐는지 판단하기
			if(conn!=null) {
				System.out.println("접속 성공!");
			} else {
				System.out.println("접속 실패");
			}
			
			// 3. SQL 작성 및 전송 ->  PreparedStatement
			String sql ="select * from student ";
			
			psmt = conn.prepareStatement(sql);
			
			// SQL 문장 전송 작업필요!
			// ResultSet -> select sql문장 실행시 돌아오는 테이블 형태를
			// 담을 수 있는 객체!
			rs= psmt .executeQuery(); // > sql에서 enter 치는 것과 같음
			
			while(rs.next()) {
				String name = rs.getString("name"); // rs.getString(1)
				int age = rs.getInt("age"); // rs.getString(2)
				String gender = rs.getString("gender"); // rs.getString(3)
				
				// 하나의 행에 대하여 다 가져온 후 한번에 출력하기
				System.out.println(name + " / " + age + " / " + gender);
			}
				
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 오류");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");
		}
		
		// 4. 객체 연결 종료
		finally { // 마지막에 무조건 수행할 수 있는 키워드
			// 객체 닫는 순서? 역순으로...
			// Connection(conn) <- PreparedStatement(psmt) <- ResultSet(rs)
			
			
				try {
					if(rs != null) {
						// 객체사용 여부 확인
						rs.close();
					} if(psmt != null) {
						psmt.close();
					} if (conn != null) {
						conn.close();
					}
			} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
