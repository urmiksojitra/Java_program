import java.util.*;
class Demo
{
	public static void main(String args[])
	{
			int a,b,c;
			char h;
			Scanner s=new Scanner(System.in);
			Mini m=new Mini();
			m.mini();
		
	}
}
class Sum
{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	void sum()
	{
		char h;
			System.out.println("enter a=");
			a=s.nextInt();
			System.out.println("enter b=");
			b=s.nextInt();
			System.out.println("sum="+(a+b));
			Mini m=new Mini();
			System.out.println("if you reapeat this switch case so press y");
			 h=s.next().charAt(0);
			if(h=='y')
			{
				m.mini();
			}		
	}
}
class Sub
{
	int a,b,c;
	char h;
	Scanner s=new Scanner(System.in);
	void sub()
	{
			System.out.println("enter a=");
			a=s.nextInt();
			System.out.println("enter b=");
			b=s.nextInt();
			System.out.println("sum="+(a-b));
			Mini m=new Mini();
			System.out.println("if you reapeat this switch case so press y");
			 h=s.next().charAt(0);
			if(h=='y')
			{
				m.mini();
			}		
	}	
}
class Mul
{
	int a,b,c;
	char h;
	Scanner s=new Scanner(System.in);
	void mul()
	{
			System.out.println("enter a=");
			a=s.nextInt();
			System.out.println("enter b=");
			b=s.nextInt();
			System.out.println("sum="+(a*b));
			Mini m=new Mini();
			
			System.out.println("if you reapeat this switch case so press y");
			 h=s.next().charAt(0);
			if(h=='y')
			{
				m.mini();
			}		
	}
}
class Mod
{
	int a,b,c;
	char h;
	Scanner s=new Scanner(System.in);
	void mod()
	{
			System.out.println("enter a=");
			a=s.nextInt();
			System.out.println("enter b=");
			b=s.nextInt();
			System.out.println("sum="+(a%b));
			Mini m=new Mini();
			System.out.println("if you reapeat this switch case so press y");
			 h=s.next().charAt(0);
			if(h=='y')
			{
				m.mini();
			}		
	}
}
class Div
{
	int a,b,c;
	char h;
	Scanner s=new Scanner(System.in);
	void div()
	{
			System.out.println("enter a=");
			a=s.nextInt();
			System.out.println("enter b=");
			b=s.nextInt();
			System.out.println("sum="+(a/b));
			Mini m=new Mini();
			System.out.println("if you reapeat this switch case so press y");
			 h=s.next().charAt(0);
			if(h=='y')
			{
				m.mini();
			}		
	}
}
class Mini
{
	int c;
	char h;
	void mini()
	{
			Scanner s=new Scanner(System.in);
			System.out.println("press 1 for sum");
			System.out.println("press 2 for sub");
			System.out.println("press 3 for multi");
			System.out.println("press 4 for mod");
			System.out.println("press 5 for div");
			c=s.nextInt();
			Sum p=new Sum();
			Sub i=new Sub();
			Mul g=new Mul();
			Mod m=new Mod();
			Div d=new Div();
			Idea n=new Idea();
			switch(c)
			{
				case 1:
						p.sum();
						break;
				case 2:
						i.sub();
						break;
				case 3:
						g.mul();
						break;
				case 4:
						m.mod();
						break;
				case 5:
						d.div();
						break;
				}
		
	}
}
