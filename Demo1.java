import java.util.*;
class Demo1
{
	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of table : ");
		a=scan.nextInt();
		System.out.println("<------table ---->");
		for(int i=1;i<=10;i++)
		{

			//System.out.println(a      +"    *    "+     i +     "   =   "+(a* i));
			System.out.println(+(a,i,a*i));
			
		}
	}
}