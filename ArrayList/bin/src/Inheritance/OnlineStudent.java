package Inheritance;

public class OnlineStudent extends ClassStudent
{
    String platform="coursera";
    double costpersubject=99.0;
    double total=0.0;
    public void name()
    {
    	System.out.println("ima online student");
    }
    
    
    public void print(int num)
    {
    	super.name();
    	name();
    	//printData();
    	System.out.println("online platform:"+platform);
    	total=costpersubject+num;
    	System.out.println("total learining cost"+total);
    }
}
