import java.util.Scanner;
class Demo3
{
		public static void main(String arg[])
		{
			int a,b;
			Scanner s=new Scanner(System.in);
			System.out.println("enter value of a:");
			a=s.nextInt();
			System.out.println("enter value of b:");
			b=s.nextInt();
			Demo1 d=new Demo1();
			d.getdata(a,b);
			d.sum();
		}
}
class Demo1
{
		int a,b;
		void getdata(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
		void sum()
		{
			System.out.println("sum------->"+(a+b));
		}
}