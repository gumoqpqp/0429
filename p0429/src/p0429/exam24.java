package p0429;

import java.util.Scanner;

public class exam24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		
		switch (m){
		case 3 : case 4 :case 5: {
			
			System.out.println("봄");
			break;
		}
		case 6 : case 7 :case 8: {
			System.out.println("여름");
			break;
			
		}
		case 9 : case 10 :case 11: {
			System.out.println("가을");
			break;
		}
		default : {
			System.out.println("겨울");
			break;
		
		}
		}

	}
	}

	