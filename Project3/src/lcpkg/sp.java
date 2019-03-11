package lcpkg;

public class sp 
{
public static void main(String[] args) 
{
	String s="my name is deepak";
	String[] s1= s.split(" ");
	
	int l= s1.length;
	System.out.println("total length is "+l);
	for(int i=l-1;i>=0;i--)
	{
		System.out.println(s1[i]);
	}
}
}
