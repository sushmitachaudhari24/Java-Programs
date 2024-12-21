import java.util.*;
class Product
{
  private int pid;
  private String pname;
  private int qty;
  private int rate;

   public void setId(int ID)
    {
  	  pid=ID;
    }
    int getId()
    {
  	  return pid;
    }
    public void setName(String Name)
    {
      pname=Name;
  }
  String getName()
  {
     return pname;
  }
  public void setQty(int q)
  {
	  qty=q;
  }
  int getQty()
  {
	   return qty;
  }
  public void setRate(int r)
  {
	   rate=r;
  }
  int getRate()
  {
      return rate;
  }
}
class Customer
{
    private int cid;
     private String cname;
     private String Address;
  private String contact;

   public void setcid(int ID)
    {
  	  cid=ID;
    }
    int getcid()
    {
  	  return cid;
    }
    public void setcName(String cName)
    {
      cname=cName;
    }
     String getCname()
     {
        return cname;
	 }
     public void setAdd(String Add)
      {
        Address=Add;
    }
    String getAdd()
    {
       return Address;
	}
     public void setcont(String Contact)
      {
        contact=Contact;
      }
      String getCont()
      {
		  return contact;
	  }
}
class CalculateBill
{
	private Product p[];
	private Customer c;
	void calBill( Customer cs,Product ...pr)
	{
		c=cs;
      p=pr;
	}
	void getBill()
	{
       int total=0;
       System.out.println("\n-------------------------------------------------------------------------------------\nCustomer Details\n-------------------------------------------------------------------------------------");
       System.out.println("Customer Name:"+c.getCname()+"\tID:"+c.getcid()+"\tAddress:"+c.getAdd()+"\tCONTACT:"+c.getCont());
       System.out.println("\n Order Details");

	   	          System.out.println("ProductId\tProductName\tQty\tRate\tTotalBill");
	   	          System.out.println("------------------------------------------------------------------------");
	   	           System.out.println("------------------------------------------------------------------------");

        for(int i=0;i<p.length;i++)
        {
           System.out.println(p[i].getId()+"\t "+p[i].getName()+"\t "+p[i].getQty()+"\t "+p[i].getRate()+"\t "+(p[i].getQty() * p[i].getRate()));

           total=total+(p[i].getQty() * p[i].getRate());
		}
       System.out.println("------------------------------------------------------------------------\n------------------------------------------------------------------------\n\t\tTotal Bill is "+total);
	System.out.println("\t\t\t\tTotal is "+total);
	 System.out.println("------------------------------------------------------------------------");
	}
}
public class BillingApp
{
	public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
       Product p1=new Product();
       CalculateBill cb1=new CalculateBill();
       Customer c=new Customer();
       System.out.println("Enter Customer ID, Name ,Address,Contact");
        int cid=sc.nextInt();
        c.setcid(cid);
        String cname=sc.next();
        c.setcName(cname);
        String Cadd=sc.next();
        c.setAdd(Cadd);
        String Contact=sc.next();
        c.setcont(Contact);



        int id ,rate,qty;
        String pname;
       System.out.println("1 .Enter id ,Product Name , Qty ,Rate");
        id=sc.nextInt();
       p1.setId(id);

        pname=sc.next();
       p1.setName(pname);

        qty= sc.nextInt();
       p1.setQty(qty);

        rate=sc.nextInt();
       p1.setRate(rate);
     Product p2=new Product();



	          System.out.println("2. Enter id ,Product Name , Qty ,Rate");
	           id=sc.nextInt();
	          p2.setId(id);

	           pname=sc.next();
	          p2.setName(pname);

	           qty= sc.nextInt();
	          p2.setQty(qty);

	           rate=sc.nextInt();
	          p2.setRate(rate);



         Product p3=new Product();

	          System.out.println("Enter id ,Product Name , Qty ,Rate");
	           id=sc.nextInt();
	          p3.setId(id);

	           pname=sc.next();
	          p3.setName(pname);

	           qty= sc.nextInt();
	          p3.setQty(qty);

	           rate=sc.nextInt();
	          p3.setRate(rate);
	          cb1.calBill(c,p1,p2,p3);

              cb1.getBill();


    }
}