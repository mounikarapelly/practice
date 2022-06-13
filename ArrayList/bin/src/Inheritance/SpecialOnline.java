package Inheritance;

public class SpecialOnline extends OnlineStudent
{
	double discountrate=30;
	public String subjects;
	public void main()
	{
		System.out.println("spl online student");
		
	}
	public void discount()
	{
		int total = 0;
		double newtotal=total-(total*discountrate);
		System.out.println("discontrate cost:"+newtotal);
		
		
	}
	

	
	

}
