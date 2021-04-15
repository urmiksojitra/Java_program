import java.util.*;
class inheri_over
{
	public static void main(String[] args) 
	{
		in_three t=new in_three();
		//in_three tt=new in_three(10);

		t.getdata(5,10);
		t.max();

		t.data(5);
		//t.fact();

		t.num(-5);
		//t.check_num();
	}
}
class in_one
{
	int no,no1;
	/*in_one()
	{
		System.out.println("--------one-------- ");
	}
	in_one(int nn)
	{
		System.out.println("--------one--------> "+nn);
	}*/
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
	/*in_two()
	{
		System.out.println("--------two-------- ");
	}
	in_two(int nn)
	{
		super(30);
		System.out.println("--------two--------> "+nn);
	}*/
	void data(int no)
	{
		this.no=no;
	}
	void max()
	{
		super.max();
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
	/*in_three()
	{
		System.out.println("--------three-------- ");
	}
	in_three(int nn)
	{
		super(20);
		System.out.println("--------three--------> "+nn);
	}*/
	void num(int no)
	{
		this.no=no;
	}
	void max()
	{
		super.max();
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