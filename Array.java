import java.util.*;
import java.lang.*;
class Array
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] n=new int[3][3];
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				n[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				System.out.println(n[i][j]+"  ");
			}
			System.out.println();
		}

	}
}
