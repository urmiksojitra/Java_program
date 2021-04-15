class Palindrome1
{
	public static void main(String[] args)
	{
		int i,b,sum=0,n;
	
		
		
		for(i=100;i<=200;i++)
		{
			n=i;
			
			while(n>0)
			{
				b=n%10;
				sum=(sum*10)+b;
				n=n/10;
			}
		
			if(i==sum)
			{

				System.out.println("NUmber is palindrom : =  "+sum);

			}

			sum=0;	
		}
			

	}
}