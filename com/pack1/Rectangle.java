package com.pack1;

public class Rectangle 
{
	private float length;
	private float width;
	
	
	 public Rectangle()
	 {
		 length=1.0f;
		 width=1.0f;
	 }
	public Rectangle(float l, float w)
	{
		length=1.2f;
		 width=3.4f;
	}
	public  float getlength()
	{
		return length;
	}
	public void setlength(float length)
	{
		this.length=length;
	}
	public float getwidth()
	{
		return width;
	}
	public void setwidth(float width)
	{
		this.width=width;
	}
	public double getArea()
	{
		return width*length;
	}
	public double getPerimeter()
	{
		return  (length+width)*2;
	}
	public String toString() 
	{
		   return "Rectangle[length =" + length  + " width=" + width + "]";
		}
	  

}
