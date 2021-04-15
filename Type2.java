class Type2
{
	public static void main(String[] args)
    {
		int no=10;
		String name="idea";
		Type t=new Type();
		t.set(no);
		t.setdata(name);
		System.out.println(t.get());
		System.out.println(t.getdata());
	}
}
class Type
{
	int no;
	String name;
	void set(int no)
	{
		this.no=no;
	}
	void setdata(String name)
	{
		this.name=name;
	}
	int get()
	{
		return no;
	}
	String getdata()
	{
		return name;
	}
}