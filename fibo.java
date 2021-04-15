import java.util.*;
class Fibo
{
	public static void main(String[] args) {
		int a=0,b=1,c,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n=");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+a );
			c=a+b;
			a=b;
			b=c;
			
		}	
	}
}