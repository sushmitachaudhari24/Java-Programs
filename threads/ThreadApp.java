class A extends Thread
{
   public void run()
   {   try
	  {
	      for(int i=1; i<=15; i++)
		  {
		    System.out.printf("First Thread is %d\n",i);
			Thread.sleep(10000);
		  }
	  }
	  catch(Exception ex)
	  { System.out.println("Error is "+ex);
	  }
   }
}
class B extends Thread
{
   public void run()
   {
      try
	  {
	      for(int i=1; i<=20; i++)
		  {
		    System.out.printf("Second Thread is %d\n",i);
			Thread.sleep(1000);
		  }
	  }
	  catch(Exception ex)
	  { System.out.println("Error is "+ex);
	  }
   }
}
public class ThreadApp
{   public static void main(String x[])throws Exception
    {
		 A a1 = new A();
		 a1.start();
		 //a1.join();
		 System.out.println("Now status of a1 :"+a1.isAlive());
		 B b1 = new B();
		 b1.start();
	}
}
