import java.util.*;
class Palindrome
{
	public static void main(String[] args) {
		int a,b,sum=0,no;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no :");
		a=scan.nextInt();
		no=a;
		while(a>0)
		{
			b=a%10;
			sum=(sum*10)+b;
			a=a/10;

		}

				
				if(no==sum){

						System.out.println("NUmber is palindrom : =  "+no);

				}
				else
				{
					System.out.println("NUmber is not palindrom : =  "+no);

				}

	}
}