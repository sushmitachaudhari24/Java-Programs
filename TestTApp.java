class TestT{
   TestT()
   {
    System.out.println("I am Constructor");
   }
   static{

       System.out.println("I am Static");
         }
    {
      System.out.println("I am instance");
    }
}
public class TestTApp
{
  static public void main(String []args)
  {
	 System.out.println("I am Main");

	TestT t=new TestT();

  }
}