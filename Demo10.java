import java.util.*;
import java.lang.*;
class Demo10
{
	public static void main(String[] args) 
	{
		int_demo t=new int_demo();
		Thread r=new Thread(t);
		r.start();
	}
}

class int_demo implements Runnable
{
	Thread tt=new Thread("milan");
	public void run()
	{
		tt.setPriority(5);
		for(int i=1;i<=5;i++)
		{
			try
			{
				tt.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("I ------>"+i+tt.getClass()+tt.getId());
		}
	}
}
/*class th_demo extends Thread
{
	Thread tt=new Thread("urmik");
	public void run()
	{
		tt.setPriority(7);
		for(int i=1;i<=5;i++)
		{
			try
			{
				tt.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("I ------>"+i+tt.getPriority()+tt.getClass()+tt.getId());
		}
	}
}*/