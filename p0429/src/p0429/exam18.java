package p0429;

import java.util.Scanner;

public class exam18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a;
		 System.out.println("정수 입력");
		 a=s.nextInt();
		
		 if ((a%3)==0)
			 System.out.print("3으로 나누어 집니다");
		 else 
			 System.out.println("이 값을 3으로 나는 나머지는"+a%3+"입니다");

		

	}

}
