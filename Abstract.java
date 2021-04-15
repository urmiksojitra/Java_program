//Abstract class=======================================================
import java.util.*;
import java.lang.*;
class Abstract
{
	public static void main(String[] args) 
	{
		demo1 tt=new demo1();
		tt.set(20,50);

		tt.get();
	}
}
abstract class demo
{
	int no,no1;
	void set(int no,int no1)
	{
		this.no=no;
		this.no1=no1;
	}
	abstract void get();
}
class demo1 extends demo
{
	public void get()
	{
		if(no>no1)
		{
			System.out.println("no is max");
		}
		else
		{
			System.out.println("no1 is max");
		}
	}
}