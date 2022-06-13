package Abstract.com;
import java.util.Scanner;
public class MyArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("what is array size");
		int size=s.nextInt();
		int myarray[]=new int [size];
		int x=size;
		for(int i=0;i<size;i++)
		{
			myarray[i]=x*3;
			x++;
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(myarray[i] + ",");
		}

	}

}
