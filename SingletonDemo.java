class Singleton
{
  private static final Singleton instance=new Singleton();
  private Singleton()
  {
  }
  public static Singleton getInstance()
  {
  return instance;
  }
}
public class SingletonDemo
{
 public static void main(String []args)
 {
   Singleton s1=Singleton.getInstance();
   Singleton s2=Singleton.getInstance();
   if(s1==s2)
   {
     System.out.println("Both objects");
   }
 }
}