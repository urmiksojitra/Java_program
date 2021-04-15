//implements(interface)
import java.util.*;
import java.lang.*;
class Demo13
{
	public static void main(String[] args) 
	{
			th_demo t=new th_demo();
			Thread r=new Thread(t);
			r.start();	
	}	
}
class th_demo implements Runnable
{
	Thread tt=new Thread("jainil");
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
			System.out.println("I-------------->"+i+tt.getPriority()+tt.getClass()+tt.getId());
		}
	}
}