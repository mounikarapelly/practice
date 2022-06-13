package Abstract.com;

public class ClassB extends  ClassA
{
	void meth1()
	{
		System.out.println("abstract method called");
	}

	public static void main(String[] args) 
	{
		ClassA aobj =new ClassB();
		aobj.meth1();
		aobj.meth2();
       // aobj.meth3();//cant be calld static method
	}

}
