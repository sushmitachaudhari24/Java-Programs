import java.util.*;
class Employee
{
 private int id;
 private String name;
 private int sal;
 Employee(int id,String name,int sal)
 {
  this.id=id;
  this.name=name;
  this.sal=sal;
 }
 public int getid()
 {
  return id;
 }
 public String getname()
 {
  return name;
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
    System.out.println("Enter ID,Name,Sal");
    int id=sc.nextInt();
    String name=sc.next();
    int sal=sc.nextInt();
    Employee e=new Employee(id,name,sal);
    System.out.println("Employee details");
    System.out.println(e.getid()+"\t"+e.getname()+"\t"+e.getsal());
   }
}  