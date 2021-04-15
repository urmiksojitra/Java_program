import java.util.*;
import java.lang.*;
import java.util.regex.*;


class Heand
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

			

			try
			{
				try
				{
					a[6]=10;
				}
				catch(Exception ee)
				{
					System.out.println(ee);	
				}
				System.out.println("Divison"+(no/no1));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Hello");

		}
}