import java.util.*;
class Employee
{
  private int eid;
  private String ename;
  private int esal;
  public void setId(int eid)
  {
   this.eid=eid;
  }
  public int getId()
  {
   return eid;
  }
  public void setName(String ename)
  {
   this.ename=ename;
  }
  public String getName()
  {
   return ename;
  }
  public void setSal(int esal)
  {
   this.esal=esal;
  }
  public int getSal()
  {
   return esal;
  }
}

public class EmployeePojo
{
  public static void main(String []args)
  {
    Employee e=new Employee();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter id name sal");
    int eid=sc.nextInt();
    String ename=sc.next();
    int esal=sc.nextInt();
    e.setId(eid);
    e.setName(ename);
    e.setSal(esal);
    System.out.println("Employee Details are \n\nEmployee Id: "+e.getId()+"\nEmployee name: "+e.getName()+"\nEmployee Salary: "+e.getSal());
  }
}