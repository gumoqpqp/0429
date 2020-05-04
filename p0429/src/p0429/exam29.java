package p0429;

import java.util.Scanner;

public class exam29 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
	int i=1, j, n=1;
	

	
	System.out.print("정수 입력 : ");
	j=s.nextInt();
			
	do
	{
	
	n=n*i;
		i++ ;
	}while( i<=j);

		
			System.out.printf("1부터 %d 까지의 곱은 %d 입니다.",j,n);
			
		}
			
}
		


