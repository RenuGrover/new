package lcpkg;

import java.util.Scanner;

public class swapping 
{
	public static void main(String[] args)
	{
		System.out.println("enter value of 2 variable");
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c;
		
		System.out.println("after swapping");
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);		
		
	}

}
