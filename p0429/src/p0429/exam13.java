package p0429;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a, b;
		 System.out.println("정수 입력");
		 a=s.nextInt();
		 System.out.println("정수 입력");
		 b=s.nextInt();	
		 
		 if ((a%b)==0)
			 System.out.println("약수 입니다");
		 else
			 System.out.println("약수가 아닙니다");
		 
		 
	}

}
