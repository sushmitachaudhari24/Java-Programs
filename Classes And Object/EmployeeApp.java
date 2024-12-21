import java.util.*;
class Employee
{
  int eid;
  int esal;

   void getdata(int id ,int sal)
   {
     eid=id;
     esal=sal;
   }
   void putdata()
   {
     System.out.println("Record of Employee");
     System.out.println("Employee ID : "+eid+"\nEmployee Salary : "+esal);
   }
}
public class EmployeeApp
{
  public static void main(String []args)
  {
    Employee e=new Employee();
    e.getdata(1001,20000);
    e.putdata();
  }
}