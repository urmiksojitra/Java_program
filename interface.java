//interface========================================SWSSS
import java.util.*;
import java.lang.*;
class Urmik
{
	public static void main(String arg[])
	{
		hello t=new hello();
		t.get();
		t.getdata();

	}
}
interface idea
{
	int no=10,no1=15;
	void get();
}
interface idea1
{
	int z=8;
	void getdata();
}
class hello implements idea,idea1
{
	public void get()
	{
		int a=10;
		int b=20;
		if(a>b)
		{
			System.out.println("no is max");
		}
		else 
		{
			System.out.println("no1 is max");
		}
	}
	public void getdata()
	{
		System.out.println("hellpo");
	}
}