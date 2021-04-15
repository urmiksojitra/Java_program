import java.util.*;
class Array2
{

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[10];
		int n,z;
		System.out.println("enter a value n=>");
		
		n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			System.out.println("enter a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.println("--------------------->simple for<----------------");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("find your number =");
		z=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(z==a[i])
			{
				System.out.println("find num=>"+z);
			}
			if(z!=a[i])
			{
				System.out.println("not found num");
			}
		}
	}
}