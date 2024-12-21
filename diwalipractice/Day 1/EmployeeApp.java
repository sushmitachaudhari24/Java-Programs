import java.util.*;
class Employee
{
  private String name;
  private String jobtitle;
  private int sal;
    public void setname(String name)
    {
     this.name=name;
    }
    public String getname()
    {
      return name;
    }
    public void setjob(String job)
    {
     jobtitle=job;
    }
    public String getjob()
    {
     return jobtitle;
    }
    public void setsal(int sal)
    {
     this.sal=sal;
    }
    public int getsal()
    {
     return sal;
    }
}
public class EmployeeApp
{
 public static void main(String []args)
 {
 Scanner sc=new Scanner(System.in);
  Employee e=new Employee();
  e.setname("Sush");
  e.setjob("software Developer");
  e.setsal(50000);
  System.out.println("Employee Record \nEmployee name "+e.getname()+"\nEmployee Job "+e.getjob()+"\nEmployee Salary "+e.getsal());
  System.out.println("Do you want to update salary(y/n) ?");
  char ch=sc.next().charAt(0);
  switch(ch)
  {
   case 'y':
   case 'Y': System.out.println("Enter new Salary ");
             int nsal=sc.nextInt();  
              e.setsal(nsal);
                System.out.println("New Employee Record \nEmployee name "+e.getname()+"\nEmployee Job "+e.getjob()+"\nEmployee Salary "+e.getsal());
            break;    
   case 'n':
   case 'N' :System.out.println("Okey then No Problem");break;
   default:System.out.println("You have Enter Wrong Choice !!!");
  }
  
 }
}