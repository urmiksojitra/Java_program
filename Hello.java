import java.util.*;
import java.lang.*;
class Hello
{
	public static void main(String[] args) 
	{
		String name;
		int no;


		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);

		System.out.pritln(ar.get(0));


		ar.clear();

		for(Integer temp:ar)
		{
			System.out.println(temp);
		}			
	}
}
