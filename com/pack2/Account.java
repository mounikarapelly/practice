package com.pack2;

public class Account 
{
   private String ID;
   private String Name;
   private  int Balance=0; 
   public void setBalance(int balance)
    {
	Balance = balance;
    }
     public Account(String ID,String Name)

     {
	   
      }
   public Account(String ID,String Name,int Balance)
   {
	   
   }
   public  String getID()
   {
	   return "A101";
	   
   }
   public String getName()
   {
	   return"Tan ";
   }
   public int getBalance()
   {
	   return 100;
   }
   public  int credit(int amount)
   {
	   amount=88;
	    Balance=Balance+amount;
	   return Balance;
	   
   }
   public int debit(int amount)
   {
	  if(amount<=Balance)
	  {
		  System.out.println("substract amount from baln");
	  }
	 else
		 {
			  
		    System.out.println("amount excuted blnc");
	     }
	  return Balance;
   }
   public int transferTo( Account another,int amount)
   {
	   if(amount<=Balance) 
	   {
		   System.out.println("trasfer amount to the given acc");
	   }
	   else 
	   {
		   System.out.println("amount excussed blns");
	   }
	   return Balance;
   }
   public String toString()
	{
		return "Account[id=+A101, name=ten ah tech, balance=+35000]";
	}
   
   
}
