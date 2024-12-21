import java.util.*;
class Product
{
  private int pid;
  private String pname;
  private int price;
  public void setdata(int id,String name,int p)
  {
    pid=id;
    pname=name;
    price=p;
  }
  public int getid()
  {
   return pid;
  }
  public String getname()
  {
   return pname;
  }
  public int getprice()
  {
   return price;
  }
}
public class ProductApp1
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   Product p[]=new Product[3];
   for(int i=0;i<p.length;i++)
   {
     p[i]=new Product();

     System.out.println("Enter product ID NAME PRICE:");
     int id=sc.nextInt();
     String name=sc.next();
     int prc=sc.nextInt();
     p[i].setdata(id,name,prc);
   }
   System.out.println("======================================================\n\t\tRecords ARE ....\n======================================================");
   System.out.println("ProductId\t\tProductName\t\tProductPrice");
   for(int i=0;i<p.length;i++)
   {
        System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getprice());
   }
   System.out.println("======================================================");
   for(int i=0;i<p.length;i++)
   {
       for(int j=i+1;j<p.length;j++)
       {

	   }
   }
  }
}