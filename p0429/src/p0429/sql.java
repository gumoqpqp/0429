package p0429;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class sql {
Scanner s = new Scanner(System.in);
public sql

connectDB();
System.out.println("#이벤트 등록을 위해 이름과 이메일을 입력하세요");


System.out.print("이름 : ");
String unmae=s.next();
System.out.print("이메일: ");
String 
registerUser(uname,email);

public void connect DB();
	
	String jdbcDriver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost/0428?serverTimezone=UTC";
	Connection con=null;
			PreparedStatement pstmt=null;
			ResultSet rs;
					try{
						Class.forName(jdbcDriver);
						System.out.println("데이터베이스 연결중...");
						con= DriverManager.getConnection(url,"root","1234");
						System.out.println("데이터베이스 연결성공...");
					}catch(Exception e){
						e.printStackTrace();
						
					}
}
public void registerUser(String name, String email){
	String sql="insert into eventvaluse(?,?)";
	try {
		pstmt=con.prepareStatement (sql);
		pstmt.setStromg(1, name);
		pstmt.setStromg(2, email);
		pstmt.executeUpdate();
		
		
	}	catch(Exception e){
		e.printStackTrace();
		
		
	}		
}
public static void main(String[] args) {
	   sql er =new sql();
	   
}
}

