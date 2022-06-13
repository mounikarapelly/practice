package Abstract.com;

public  abstract class ClassA
{
	abstract void meth1();
	public void meth2()
	{
		System.out.println("abstrcat class mehod called");
	}
	public static void meth3()
	{
		System.out.println("static method called");
	}
	ClassA()
	{
		System.out.println("default constructor");
	}
	
       
	public static void main(String[] args) 
	{
		//ClassA A1=new ClassA();
		//	A1.meth3();
	
}
}
