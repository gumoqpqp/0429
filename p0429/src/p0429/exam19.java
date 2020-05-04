package p0429;

import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		int a;

		System.out.print("점수");
		a=s.nextInt();
		

		if(a>=0 && a<=100) {
			if(a>=80) 
			System.out.println("수");
		 else if(a>=70) 
			System.out.println("우");
		 else if(a>=60) 
			System.out.println("미");
		 else if(a>=50) 
			System.out.println("양");
		 else
			System.out.println("가");


	}
}

}