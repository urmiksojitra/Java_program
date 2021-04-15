import java.util.*;
import java.lang.*;
import java.util.regex.*;


class Throws
{
		public static void main(String[] args) 
		{
			int []a=new int[5];
			int no,no1;

			Scanner scan=new Scanner(System.in);
			System.out.println("enter no=>");
			no=scan.nextInt();

			System.out.println("ENter no1=>");
			no1=scan.nextInt();
			in_throw obj=new in_throw();
			try
			{
				obj.getdata(no,no1); 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
class in_throw
{
	void getdata(int no,int no1) throws Exception
	{
		if(no1==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println(no/no1);	
		}
		
	}
}