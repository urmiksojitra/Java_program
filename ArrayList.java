import java.util.*;
import java.lang.*;
class arrayList
{
	public static void main(String[] args) 
	{
		Stirng name;	
		int no;

		ArrayList<String> al=new ArrayList<>();

		
		al.add("jatin");
		al.add("jainil");
		al.add("urmik");
		al.add("milan");

		for(String temp:al)
		{
			System.out.println(temp);
		}


		System.out.println("remove");
		al.remove(1);

		for(String temp:al)
		{
			System.out.println(temp);
		}


		System.out.println("clear");
		al.clear();
		for(String temp:al)
		{
			System.out.println(temp);
		}


		System.out.println("clear");
		System.out.println(al.get(1));



	}
}