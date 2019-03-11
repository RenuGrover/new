package lcpkg;

import java.util.Scanner;

public class primeno2 
{
public static void main(String[] args) 
{
	System.out.println("enter value");
	Scanner s= new Scanner(System.in);
	int a=s.nextInt();
	int i;
	int temp=0;
	for(a=5;a<=50;a++)
	{
	for(i=2;i<=a-1;i++)
	{
		if(a%i==0)
		{
		temp=temp+1;
		}
	}
	if (temp==0)
	{
		System.out.println(a);
	}
	else
	{
	temp=0;
	}
}	
}
	
}
