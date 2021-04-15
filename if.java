import java.util.*;
class If
{
	public static void main(String args[])
	{
			int a;
			Scanner s=new Scanner(System.in);
			System.out.println("enter a=");
			a=s.nextInt();
			//if
			if(a>0)
			{
				System.out.println("number is positive");
			}
			//if...else
			if(a>0)
			{
					System.out.println("number is positive");
			}
			else
			{
					System.out.println("number is negative");
			}	
			//nested if
			if(a>0)
			{
				System.out.println("number is positive");
			}
			else
			{
				if(a==0)
				{
					System.out.println("number is zero");
				}
				else
				{
					System.out.println("number is nagative");
				}
			}
			//leader else...if
			if(a>0)
			{
					System.out.println("number is positive");
			}
			else if(a<0)
			{
					System.out.println("number is negative");
			}
			else if(a==0)
			{
					System.out.println("number is zero");
			}
	}	

}