package p0429;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		 
	    System.out.print("실수 a：");
	    double a = s.nextDouble();       
	    System.out.print("실수 b：");
	    double b = s.nextDouble(); 
	 
	    double c = a > b ? a : b;
	    if (a > b)          
	    	 System.out.println("큰 쪽의 값은 " + c  + "입니다.");     
	    
	 
	   
		
		

	}
}


