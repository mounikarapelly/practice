package Inheritance;

public class ClassStudent 
{
     String collegename="kakathiya University";
     String designation="student";
     int studentID;
     String[]subjects;
     public void name()
     {
    	 System.out.println("student");
     }
     public void printData()
     {
    	 System.out.println("college :"+collegename);
    	 System.out.println("desigation :"+designation);
    	 System.out.println("studentid :"+studentID);
    	 System.out.println("subjects");
    	/* for(int i=0;i<subjects.length;i++)
    	 {
    		 System.out.println(subjects[i]+"");
    	 }*/
    	 System.out.println();
    	 
     }
}
