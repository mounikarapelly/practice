package com.pack5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human
{
	//@Autowired
   // @Qualifier("octpousHeart")
	private Heart heart;
	 /*public Human() {
		 
	 }
		
	public Human(Heart heart)
	{
		this.heart = heart;
		System.out.println("human constructor is getting called");
	}
	
    @Autowired
    @Qualifier("octpousHeart")
    public  void setHeart(Heart heart) 
	{
		this.heart = heart;
		System.out.println("setter method called");
	}*/
	public void startPumping()
	{
		if(heart != null) 
		{
		heart.Pump();
		System.out.println("name of th eanimal is" +heart.getNameOfAnimal() +"no of heart present:"+heart.getNoOfHeart());
		}
		else 
		{
			System.out.println("you are dead");
		}
	}

}
