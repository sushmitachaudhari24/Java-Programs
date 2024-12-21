import java.util.*;
class Student
{
  private int id ;
  private int totalfees;
  private String name;
  private float per;
  private int disfees;
  private int apf;
  //private DiscountFees df;

  public void setId(int id)
  {
   this.id=id;
  }
  public int getId()
  {
   return id;
   }
   public void setName(String name)
   {
   this.name=name;
   }
   public String getName()
   {
   return name;
   }
   public void setPer(float per)
   {
   this.per=per;
   }
   public float getPer()
   {
    return per;
   }
   public void setTotal(int total)
   {
   totalfees=total;
   }
   public int  getTotal()
   {
    return totalfees;
   }
   public void setDisfees(int dfee)
   {
	   disfees=dfee;
   }
   public int getDisfees()
   {
       return disfees;
   }
    public void setApf(int apf)
      {
   	   this.apf=apf;
      }
      public int getApf()
      {
          return apf;
   }
}
class DiscountFees
{
  private Student s;
  int ad,apf,disfees;
  public void setStudent(Student stud)
  {
  s=stud;
  }
  public void checkDiscountEligibility(Float per)
  {
    if(per >= 60.0f)
    {
      ad=(int)(0.3f *s.getTotal());
    }
    s.setDisfees(ad);
    apf=s.getTotal() - s .getDisfees();
    s.setApf(apf);
  }
  public void show()
  {
  System.out.println("Roll_No: "+s.getId()+"\nStud_Name: "+s.getName()+"\nPercentage: "+s.getPer()+"\nTotal_Fees: "+s.getTotal()+"\nDiscountFees: "+s.getDisfees()+"\nActual Paid Fees: "+s.getApf());
  }
}
public class StudentDiscountApp
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   Student s[]=new Student[3];
   DiscountFees df[]=new DiscountFees[3];
   for(int i=0;i<s.length;i++)
    {s[i]=new Student();
    df[i]=new DiscountFees();
      System.out.println("\nEnter Id Name Per TotalFees");
	    int id=sc.nextInt();
	    String name=sc.next();
	    float per=sc.nextFloat();
	    int tf=sc.nextInt();
	    s[i].setId(id);
	    s[i].setName(name);
	    s[i].setPer(per);
	    s[i].setTotal(tf);

   df[i].setStudent(s[i]);
	   df[i].checkDiscountEligibility(per);
   df[i].show();
  }
  }
}