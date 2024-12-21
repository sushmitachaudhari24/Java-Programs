class Even extends Thread
{
	synchronized public  void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{   if(i%2==0)
			    {
				System.out.println("Even Thread is "+i);
				Thread.sleep(1000);
			    }
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is"+e);
		}
	}
}
class Odd extends Thread
{
	public void run()
	{
		try
	    {
			for(int i=1;i<=10;i++)
			{
				if(i%2!=0)
				{
					System.out.println("Odd Thread is "+i);
					Thread.sleep(1000);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is"+e);
		}
	}
}
public class EvenOddThreadSyncronized
{
	  public static void main(String []args) throws Exception
	  {
		  Even e=new Even();
		  e.start();
		 // e.join();
		  Odd o=new Odd();
		  o.start();
	  }
}