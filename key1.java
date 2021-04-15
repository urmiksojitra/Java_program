import java.util.*;
class Key1
{
	public static void main(String[]args)
	{
		int i;
		for(i=1;i<=6;i++)
		{
				if(i%2==1)
				{
					System.out.print(" "+(i*i*i));
				}
				else 
				{
					System.out.print(" "+(i*i));	
				}
		}
	}
}