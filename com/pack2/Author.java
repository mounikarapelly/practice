package com.pack2;

public class Author 
{
	private String Name;
	private String Email;
	private char Gender;
	
	 
	public Author(String Name,String Email,char gender)
	 {
		 
	 }
	 public  String getName()
	 {
		 return "sree";
	 }
	 public String getEmail()
	 {
		 return "sree@gamil.com";
	 }
	 public void setEmail(String email) 
	 {
			this.Email = email;
	 }
	 public char getGender()
	 {
		 return 'M';
	 }
	
	 public String toString() 
	 {
		   return "Author[name=+Sree,email=+sree@gmail.com,gender=+M]";
	 }

}
