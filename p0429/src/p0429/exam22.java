package p0429;

import java.util.Scanner;

public class exam22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		 
	    System.out.print("정수 a：");
	    int a = s.nextInt();       
	    System.out.print("정수 b：");
	    int b = s.nextInt(); 
	    System.out.print("정수 c：");
	    int c = s.nextInt(); 
	 
	    int d;
	    if (a < b && a < c) {
            d = a;
        } else if (b < a && b < c) {
            d = b;
        } else {
            d = c;
        }
        System.out.println("최소값은 " + c + "입니다.");
 
 
  
	}

}
