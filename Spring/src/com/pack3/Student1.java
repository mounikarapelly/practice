package com.pack3;

public class Student1 
{
    int id;
	MathCheat mathCheat;

	public void setId(int id) {
		this.id = id;
	}

    // MathCheat mathCheat= new MathCheat();
    
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
   public void cheating()
   {
	   mathCheat.mathCheat();
	   System.out.println("hey my id is:  "    +id+ "   take do whatever you want to do..");
	   
   }
   
}
