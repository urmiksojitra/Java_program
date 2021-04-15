class Constructor
{
	public static void main(String[] args)
	{
		//defailt constructor
		Con1 obj=new Con1();
		//new Con1().sum();
		obj.sum();

		//perameter construc	
		Con2 obj1=new Con2(10,20);
		//new Con2().sum(5,10);
		obj1.sum();
	}
}
class Con1
{
	int no,no1;
	Con1()
	{
		no=10;
		no1=15;
	}
	void sum()
	{
		System.out.println("sum----->"+(no+no1));
	}
}
class Con2
{
	int no,no1;
	int a,b;
	Con2(int a,int b)
	{
		this.no=a;
		this.no1=b;
	}
	void sum()
	{
		System.out.println("sum----->"+(no+no1));
	}
}