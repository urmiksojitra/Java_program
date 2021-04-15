import java.util.*;
class Demo4
{
	public static void main(String args[])
	{
		int z;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("press 1 for sum");	
		System.out.println("press 2 for multiplication");
		System.out.println("press 3 for division");
		System.out.println("press 4 for substract");
		System.out.println("press 5 for modular");

		Sum p=new Sum();
		Mul q=new Mul();
		Div r=new Div();
		Sub s=new Sub();
		Mod t=new Mod();

		z=scan.nextInt();
		switch(z)
		{
			case 1:
					p.sum();
					break;
			case 2:
					q.mul();
					break;
			case 3:
					r.div();
					break;
			case 4:
					s.sub();
					break;
			case 5:
					t.mod();
					break;
		}
		
	}
}
class Sum
{
	Scanner scan=new Scanner(System.in);
	void sum()
	{
		int a,b;
		System.out.println("enter a------>");
		a=scan.nextInt();
		System.out.println("enter b------>");
		b=scan.nextInt();
		System.out.println("sum------>"+(a+b));
	}
}
class Mul
{
	Scanner scan=new Scanner(System.in);
	void mul()
	{
		int a,b;
		System.out.println("enter a------>");
		a=scan.nextInt();
		System.out.println("enter b------>");
		b=scan.nextInt();
		System.out.println("sum------>"+(a*b));
	}
}
class Div
{
	Scanner scan=new Scanner(System.in);
	void div()
	{
		int a,b;
		System.out.println("enter a------>");
		a=scan.nextInt();
		System.out.println("enter b------>");
		b=scan.nextInt();
		System.out.println("sum------>"+(a/b));
	}	
}
class Sub
{
	Scanner scan=new Scanner(System.in);
	void sub()
	{
		int a,b;
		System.out.println("enter a------>");
		a=scan.nextInt();
		System.out.println("enter b------>");
		b=scan.nextInt();
		System.out.println("sum------>"+(a-b));
	}
}
class Mod
{
	Scanner scan=new Scanner(System.in);
	void mod()
	{
		int a,b;
		System.out.println("enter a------>");
		a=scan.nextInt();
		System.out.println("enter b------>");
		b=scan.nextInt();
		System.out.println("sum------>"+(a%b));
	}
}