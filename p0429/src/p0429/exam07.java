package p0429;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
	    double sum, average;
	        
	   Scanner s=new Scanner(System.in); 

	        
	        System.out.print("x값: ");
	        a=s.nextDouble();
	        System.out.print("y값: ");
	        b=s.nextDouble();
	      
	       
	       
	        
	        sum=a+b;
	        average=sum/2;
	        
	        System.out.println("합: "+sum);
	        System.out.println("평균: "+average);
	}

}
