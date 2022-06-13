package cg.com.pack;

public class circle 
{
	class Circle {
		
		private String area;
		private String perimeter;
		private int radius;
		public double getArea() 
		{
			return 	 Math.PI*Math.pow(this.radius, 2);
		}
		
		public double getPerimeter() {
			return 2*Math.PI*this.radius;
		}
		
		@Override
		public String toString() {
			return "Circle [area=" + area + ", perimeter=" + perimeter + "]";
		}
		public Circle(String area, String perimeter)
		{
			
			this.area = area;
			this.perimeter = perimeter;
		}
		
		
	}
	public static void main(String[] args) 
	{
		    circle con1=new circle();
		   System.out.println("");
		    
	}
}
