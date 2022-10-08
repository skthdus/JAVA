package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_Delete {

	public static void main(String[] args) {

		// 삭제하고자 하는 이름과 동일한 이름을 가지고 있는 
		// 데이터 삭제하기
		// ex) 김미희 입력시 -> 해당 데이터 삭제
		
		Connection conn = null;
		PreparedStatement pmst = null;
		
		Scanner sc = new Scanner(System.in);
		
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
			
			System.out.print("삭제 할 이름 : ");
			String name = sc.next();
			
			// 입력한 이름과 동일한 데이터 삭제하는 sql문장 입력하기
			String sql = "delete from student where name = ? ";
			pmst = conn.prepareStatement(sql);
			
			pmst.setString(1, name);
			
			int result = pmst.executeUpdate();
			
			if(result > 0 ) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
			
		} catch (Exception e) {
			System.out.println("오류발생");
		}
		
		finally {
				try {
					if(pmst != null) {
					pmst.close();
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


