package Inheritance;

public class TestStudent {
     
		
	
	//public static void main(String[] args) {
		ClassStudent s=new ClassStudent();
		s.studentID=1000;
		String[]subs= {"java","advance","oracle"};
		s.subjects=subs;
		System.out.println("super class output");
		s.printData();
		System.out.println();
		OnlineStudent os= new OnlineStudent();
		os.studentID=1001;
		String[]online= {"db","ui","java","advance","oracle"};
		s.subjects=online;
		int subnumber=online.length;
		System.out.println("online student");
		//os.print(subnumber);
		System.out.println();
		
		
		
		
		PartTime pt =new PartTime();
		pt.studentID=1002;
		pt.dayofclass="monday";
		pt.timeofclas="9am to 3pm";
		//pt.Occupation="manager";
		pt.subjects=subs;
		System.out.println("part time student");
		pt.output();
		System.out.println();
		SpecialOnline so=new SpecialOnline();
		so.studentID=1003;
		so.subjects="online";
		System.out.println("spl online ");
		//Object subNumber;
		//so.print( subNumber);
		so.discount();
		
		
		
		
	
		
				
				
		
		
		
		

	}

}
