import java.util.*;
class CompanyPojo
{
  private int id;
  private int sal;
  private String name;
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
   public void setSal(int sal)
   {
    this.sal=sal;
   }
   public int getSal()
   {
     return sal;
   }
}
public class CompanyPoJoApp
{
  public static void main(String []args)
  {
   CompanyPojo cp=new CompanyPojo();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter id");
   int id=sc.nextInt();
   cp.setId(id);
   System.out.println("Enter name");
   String name=sc.next();
   cp.setName(name);
   System.out.println("Enter sal");
   int sal=sc.nextInt();
   cp.setSal(sal);
   System.out.println(cp.getId()+"\t"+cp.getName()+"\t"+cp.getSal());
  }
}