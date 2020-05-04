package p0429;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		 System.out.println("정수 입력");
		 a=s.nextInt();
		
		 if ((a%10)==0)
			 System.out.print("10의 배수입니다");
		 else
			 System.out.println("10의 배수가 아닙니다.");

	}

}
