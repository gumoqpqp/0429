package p0429;

import java.util.Scanner;

public class exam28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a;
		

	
		do {
			System.out.print("세 자리의 정숫값:");
			a = s.nextInt();
		}while(a<=100 || a>=999);
		System.out.println(a);
	}

}