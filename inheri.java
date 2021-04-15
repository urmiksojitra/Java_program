import java.util.*;
class inheri
{
	public static void main(String[] args) 
	{
		in_three t=new in_three();

		t.getdata(5,10);
		t.max();

		t.data(5);
		t.fact();

		t.num(-5);
		t.check_num();
	}
}
class in_one
{
	int no,no1;
	void getdata(int no,int no1)
	{
		this.no=no;
		this.no1=no1;
	}
	void max()
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
class in_two extends in_one
{
	int no;
	void data(int no)
	{
		this.no=no;
	}
	void fact()
	{
		int f=1;
		for(int i=1;i<=no;i++)
		{
			f=f*i;
		}
		System.out.println("fact---------->"+f);
	}
}
class in_three extends in_two
{
	int no;
	void num(int no)
	{
		this.no=no;
	}
	void check_num()
	{
		if(no<0)
		{
			System.out.println("negative number----->"+no);		
		}
		else
		{
			if(no==0)
			{
				System.out.println("zero number----->"+no);
			}
			else
			{
				System.out.println("positive number----->"+no);
			}
		}

	}
}