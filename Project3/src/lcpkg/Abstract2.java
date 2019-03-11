package lcpkg;

public class Abstract2 extends Abstraction
{
 public void method2()
 {
	 System.out.println("body given");
 }
 
 public static void main(String[] args) 
 {
	Abstract2 ref=new Abstract2();
	ref.method1();
	ref.method2();
}
}
