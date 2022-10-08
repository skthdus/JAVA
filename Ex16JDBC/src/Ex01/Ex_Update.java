package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_Update {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 동적로딩 -> Class.forName()
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn != null) {
				System.out.println("접속 성공");
			} else {
				System.out.println("접속 실패");
			}
			
			System.out.print("수정할 내용 선택 : [1]이름 [2]나이 [3]성별 : ");
			int menu = sc.nextInt();
			
			String sql = "";
			
			if(menu == 1) {
				sql = "";
				psmt = conn.prepareStatement(sql);
						
						
			} else if(menu == 2) {
				System.out.print("변경 할 이름 : ");
				String name = sc.next();
				
				System.out.print("변경 될 나이 : ");
				int age = sc.nextInt();
				
				sql = "update student set age = ? where name = ?";
				
				psmt = conn.prepareStatement(sql);
				
				// ?에 해당하는 데이터 연결하기
				psmt.setInt(1, age);
				psmt.setString(2, name);
				
			} else if (menu == 3) {
				sql ="";
				
			}
			
			
		
			// name, age, gender
			
			// '채수민'과 같은 이름의 age에 대하여 25 값으로 수정하는 sql문 작성
			
			
			
			
			
			
			int result = psmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
		}
		
		finally {
				try {
					if(psmt != null) {
						psmt.close();
					} if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}


