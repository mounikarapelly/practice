package Arrray.List.com;
import java.util.Scanner;
public class StudentData
{
     private static final Integer Interger = null;

	//private static final Integer Interger = null;

	public static void main(String[] args) 
     {
		//String names[]= {"jane","john","adam"};
    	String names[];
    	names =new String[3];//declaration
    	// Scanner input = new Scanner(System.in);//intialization
    	// int count=1;
    	// String name;
    	// for(int i=0;i<3;i++)
    	// {
    	//	 System.out.println("type name of the student"+count);
    	// name=input.nextLine();
    	//	 names[i]=names;
    	//	 count++,sum=0;a-mark=0,e_mark=0;
    	 //}
    	 //System.out.println("student names");
    	 //for(int i=0;i<3;i++)
    	 //{
    	//	 System.out.println(names[i]);
    	 //}
    	  String detials[][];
    	  detials=new String[3][4];
    	  Scanner input =new Scanner(System.in);
    	  int count=1,sum=0,e_mark=0,a_mark=0,highest=0;Object grandtotal = 0,average;;
    	  String name="",mode,assets,exam,total;
		//int a_mark,e_mark1;
    	  for(int i=0;i<3;i++)
    	  {
    		  for( int j=0;j<4;j++)
    		  {
    			  if(j==0)
    			  {
    				  System.out.println("type mode of student"+name);
    				  mode=input.nextLine();
    				  detials[i][j]=name;
    				  
    			  }
    			  if(j==1) {
    				  System.out.println("type mode of student"+name);
    				  mode=input.nextLine();
    				  detials[i][j]=mode;  
    			  }
    			  if(j==2)
    			  {
    				  System.out.println("type mode of student"+name);
    				  assets=input.nextLine();
    				  detials[i][j]=assets;
        			  
    		        }
    			 
    			  a_mark=Integer.parseInt(assets);
    			  e_mark = Integer.parseInt(name);
    		  }
    		  sum=a_mark+e_mark;
    		  total=Interger.toString(sum);
    		  
    		  detials[i][4]=total;
    		  {
    			  highest=0;grandtotal=0,average;
    			  
    		  }
    	  
    	  

    	 
	}
    	  System.out.println("student detials");
    	  for(int i=0;i<3;i++) 
    	  {
    		  for(int  j=0;j<5;j++)
    		  {
    			  System.out.println(detials[i][j]+"\t");
    		  }
    			System.out.println();  
    
    	  }
    	  detials[i][4]=total;
    	  grandtotal=grandtotal +sum;
    	  if(sum>highest)
    	  {
    		  highest=sum;
    		  bestscore=detials[i][0];
    	  }
    	  
    	  
    	  
    	  
}
}
