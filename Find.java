import java.util.Scanner;
class Find
{
		public static void main(String args[])
		{
			char c;
			int i,n,j,k=0,l=0;
			int a[]=new int[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 10 numbers:");
			for(i=0;i<10;i++)
			{
				a[i]=sc.nextInt();
			}

			System.out.println("enter number you want to find:");
			n=sc.nextInt();
			for(i=0;i<10;i++)
			{
				if(n==a[i])
				{
					l=1;
					System.out.println("the number is at a["+i+"]");
					System.out.println("do you want to replace??\n y/n");
					c=sc.next().charAt(0);
					if(c=='y')
					{
						System.out.println("enter number:");
						j=sc.nextInt();
						a[i]=j;
						System.out.println("replace successed");
						k=1;
					}
					else if(c=='n')
					{
						System.out.println("exit");
						

					}	
					else
					{
						System.out.println("choise not valid");
						break;
					}
					break;
				}
				else
				{
					l=0;
				}
				
		    } 
		    if(l==0)
		    {
		    	System.out.println("not found");
		    }
			
			if(k==1)
			{	
				System.out.println("new array is:");
				for(int t:a)
				{
					System.out.print(t+" ");
				}
		     } 

        }

}	



