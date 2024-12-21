import java.util.*;//program of synchronization with wait(),notify(),notifyAll()
class PrintChar
{
	synchronized  void print(int flag)
	{try{
		if(flag==1)
       {
		   for(int i=1;i<=10;i++)
          {
           System.out.println("This is ThreadOne---->"+i);
           if(i==3)
           {
			   wait();
		   }
           Thread.sleep(1000);
          }
       }
       if(flag==2)
       {
		   for(int i=0;i<6;i++)
		   {
		       System.out.println("This is ThreadTwo---->"+(char)(i+65));
		       Thread.sleep(1000);
         }
	   }
      }
      catch(Exception e)
      {
        System.out.println("Error is "+e);
      }
	}
	   synchronized void rejoin()
	   {
		      try{
				  notifyAll();
			  }
			  catch(Exception ex)
			  { System.out.println("Error is "+ex);
			  }
	   }

}
class ThreadOne extends Thread
{PrintChar pc;
    void setClass(PrintChar pc)
    {
		this.pc=pc;
	}
  public void run()
  {
   pc.print(1);
  }
}
class ThreadTwo extends Thread
{
 PrintChar pc;
     void setClass(PrintChar pc)
     {
 		this.pc=pc;
 	}
   public void run()
   {
    pc.print(2);
  }

}
public class ThreadApp11
{
 public static void main(String []args)
 {
	 PrintChar pc=new PrintChar();
   ThreadOne o=new ThreadOne();
   o.setClass(pc);
   o.start();
   ThreadTwo t=new ThreadTwo();
   t.setClass(pc);
   t.start();
 //  pc.rejoin();
 do{
	 Scanner sc=new Scanner(System.in);
	 String msg=sc.next();
	 if(msg.equals("restart"))
	 {
		 pc.rejoin();
	 }
 }while(true);
 }
}