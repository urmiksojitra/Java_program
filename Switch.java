import java.util.*;
import java.lang.*;
class Switch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String dstring;
		int d=sc.nextInt();

		switch(d)
		{
			case 1:
					dstring="sunday";
					break;
			case 2:
					dstring="monday";
					break;
			case 3:
					dstring="thusday";
					break;
			default :
					dstring="PLEASE ENTER A VLUE 1 TO 3 NO";
		}
		System.out.println(dstring);
	}
}