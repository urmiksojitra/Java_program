import java.util.Scanner;
class jp
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("a=");
		a=s.nextInt();
		System.out.println("b=");
		b=s.nextInt();
		jk p=new jk();
		p.jh(a,b);
	}

}
class jk
{
	int a,b;
	void jh(int a,int b)
	{
		
		this.a=a;
		this.b=b;