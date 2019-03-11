package lcpkg;

import java.util.Scanner;

public class PRIME 
{
public static void main(String[] args) 
{
	System.out.println("enter value");
	Scanner s= new Scanner(System.in);
	int a=s.nextInt();
	int fac=1;
	int i;
	for(i=a;i>=1;i--)
	{
		fac=fac*i;
	}
	System.out.println(fac);

}
}
