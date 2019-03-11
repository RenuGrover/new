package lcpkg;

import java.util.Scanner;

public class condition 
{

	
	public static void main(String[] args)
	{
		System.out.println("Before Swapping enter 2 value");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("After");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}
}
