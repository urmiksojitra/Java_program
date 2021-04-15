import java.util.*;
import java.lang.*;
class Demo2
{
	public static void main(String[] args) 
	{
			ArrayList<book> al=new ArrayList<>();

			al.add(new book(10,"state","jatin",100));
			al.add(new book(20,"ds","jatin",150));
			al.add(new book(30,"ADV c","jatin",510));
			al.add(new book(40,"Ac","jatin",500));
			al.add(new book(50,"RDBMS","jatin",502));
			al.add(new book(60,"DBMS","jatin",180));
			al.add(new book(70,"java","jatin",589));
			al.add(new book(80,"gujarati","jatin",580));
			al.add(new book(90,"english","jatin",220));

			
			for(book temp:al)
			{
				if(temp.getb_price()>500)
				{
					System.out.println(temp.getb_id());
					System.out.println(temp.getb_name());
					System.out.println(temp.getb_owner());
					System.out.println(temp.getb_price());	
				}
				
			}
	}
}
class book
{
	int b_id,b_price;
	String b_name,b_owner;

	book(int b_id,String b_name,String b_owner,int b_price)
	{
		this.b_id=b_id;
		this.b_name=b_name;
		this.b_owner=b_owner;
		this.b_price=b_price;
	}
	int getb_id()
	{
		return b_id;
	}
	String getb_name()
	{
		return b_name;
	}
	String getb_owner()
	{
		return b_owner;
	}
	int getb_price()
	{
		return b_price;
	}
}