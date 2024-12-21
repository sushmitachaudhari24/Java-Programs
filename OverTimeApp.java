import java.util.*;
class Employee
{
   int id,twork,salary,overtime;
   String name;
   public void setDetails(int id,String name,int twork,int overtime[--[)
   {
     this.id=id;
     this.name=name;
     this.twork=twork;
     this.overtime=overtime;
   }
   public void Display()
   {
    System.out.println("ID: "+id+"\nName: "+name+"\nTotalWorkingHours: "+twork+"\nOvertime: "+overtime+"Salary: "+getsalary());
   }
   int getsalary()
   {
     if(twork<=40 )
     {
       return 40*50;
     }
   }

}
class Overtime
{
  private Employee e[];
  public void setEmployee(Employee emp[])
  {
   e=emp;
  }
  public void calcuateovertime()
  {
    if(
  }
}
public class OverTimeApp
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);

  }
}