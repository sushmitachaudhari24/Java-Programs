import java.util.*;
class  Employee
{
   int eid;
   String ename;
   float bsal,sal,tsal;
   int p;
   public void setPersonalInfo(int id,String name,float basicsal)
   {
    eid=id;
    ename=name;
    bsal=basicsal;
   }

   public void setProgressPer(int progress)
   {
       p=progress;

       if(p>=60)
       {
         sal=bsal*0.3f;//30%sal
         tsal=bsal+sal;
       }

   }
   public void show()
   {
     System.out.println("EmpId:"+eid+"\nEmpName:"+ename+"\nBasicSal:"+bsal+"\nIncrementalSal:"+sal+"\nTotalSal:"+tsal);
   }
}
public class EmployeeApplication
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Employee Details: ID, Name,Basic Salary ,Progress Value");
   int id=sc.nextInt();
   String name=sc.next();
   float bsal=sc.nextFloat();
   int progress=sc.nextInt();

   Employee e=new Employee();
   e.setPersonalInfo(id,name,bsal);
   e.setProgressPer(progress);
   e.show();
  }
}