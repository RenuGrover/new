package lcpkg;

import java.util.Scanner;

public class primeno 
{
	public static void main(String[] args)
	{
		System.out.println("enter value");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int i;
		int temp=0;
		for(i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
			temp=temp+1;
			}
		}
		if (temp==0)
		{
			System.out.println("prime");
		}
		else
		{
		System.out.println("not prime");
		}
	}

}
