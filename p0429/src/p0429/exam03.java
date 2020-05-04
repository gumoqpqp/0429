package p0429;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		
		int a,b;
	    double sum, average;
	        
	   Scanner s=new Scanner(System.in); 

	        
	        System.out.print("정수를 입력하세요: ");
	        a=s.nextInt();
	        System.out.print("정수를 입력하세요: ");
	        b=s.nextInt();
	       
	        
	        sum=a+b;
	        average=sum/2;
	        
	        System.out.println("합: "+sum);
	        System.out.println("평균: "+average);


	
	}

}
