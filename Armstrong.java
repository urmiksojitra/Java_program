import java.util.*;
class Armstrong
{
	public static void main(String[] args) 
	{
			int n,a,mul=1,sum=0,n1;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value of n=>");
			n=sc.nextInt();
			n1=n;
			while(n>0)
			{
					a=n%10;
					mul=a*a*a;
					sum=sum+mul;
					n=n/10;
			}
			if(n1==sum)
			{
				System.out.println("armstrong number=>"+n1);	
			}
			else
			{
				System.out.println("not armstrong number=>"+n1);
			}
			
	}
}