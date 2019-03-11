package lcpkg;

import java.util.Scanner;

public class palindrome 
{
public static void main(String[] args) 
{
	System.out.println("enter no");
	Scanner s=new Scanner(System.in);
	int no=s.nextInt();
	int t=no;
	int r=0, rem;
	while(t!=0)
	{
		rem=t%10;
		r=r*10+rem;
		t=t/10;
	}
	if (no==r)
	{
		System.out.println(no+" is palindrome no");
	}
	else
	{
		System.out.println(no+" is not palindrome no");
	}
}
}
