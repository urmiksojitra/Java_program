import java.util.*;
class Array1
{

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[10];
		int n;
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
		System.out.println("--------------------->for each<----------------");
		for(int mini:a)
		{
			System.out.println(mini);
		}
		System.out.println("==================");
		System.out.println("==      SUM     ==");
		System.out.println("==================");
		int total=0;
		for(int idea:a)
		{
			
			total=total+idea;

		}
		System.out.println("sum=======>"+total);

	}
}