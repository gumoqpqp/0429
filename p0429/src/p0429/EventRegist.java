package p0429;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EventRegist {
	Scanner s = new Scanner(System.in);
	
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl= "jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
	Connection con;
	
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	public EventRegist(){
		connectDB();	
	System.out.println("#이벤트 등록을 위해 이름과 이메일을 입력하세요");
    System.out.print("이름 : ");
	String uname=s.next();
	System.out.print("이메일 : ");
	String email=s.next();
	
	
    registerUser(uname,email);
    printList();
  
	}
	
	public void connectDB(){
		
	try{
	Class.forName(jdbcDriver);
	System.out.println("데이터베이스 연결중...");
	con= DriverManager.getConnection(jdbcUrl,"root","1234");
	System.out.println("데이터베이스 연결성공...");
	}catch(Exception e){
	e.printStackTrace();
							
	}		}	
	public void printList(){
		System.out.println("#등록자 명단");
		String sql ="select * from event";
		try{
			pstmt=con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("uname")+","+rs.getString("email"));
				
			}}catch(SQLException e){
				e.printStackTrace();
				
			}
			
		
		
		
	}
	
	public void registerUser(String name, String email){
								String sql="insert into event values(?,?)";
								try {
									pstmt=con.prepareStatement (sql);
									pstmt.setString(1, name);
									pstmt.setString(2, email);
									pstmt.executeUpdate();
									
								}catch (Exception e){
									e.printStackTrace();
									
								}
									
						}
	public static void main(String[] args) {
		new EventRegist();
		
	}

}
