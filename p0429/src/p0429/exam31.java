package p0429;

import java.util.Scanner;

public class exam31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		 
	        System.out.println("1부터 n까지의 합."); 
	        System.out.print("n의 값：");
	        int n = s.nextInt(); 
	        int sum = 0;                   
	 
	        for (int i = 1; i <= n; i++)
	            sum += i;                   
	        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	    }
	
	}


