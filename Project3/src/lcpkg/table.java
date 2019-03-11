package lcpkg;

import java.util.Scanner;

public class table 
{
public static void main(String[] args) 
{
System.out.println("enter number");
Scanner s= new Scanner(System.in);
int a= s.nextInt();
int i;
int temp;
for(i=1;i<=10;i++)
{
temp=i*a;
System.out.println(temp);
}
}
}
