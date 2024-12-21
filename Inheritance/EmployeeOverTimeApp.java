import java.util.*;
class Employee			//8-hours daily	,50rs per hours
{
 int ID;
 String name;
 int Totalworking;
 int overtime;
  void setDetails(int ID,String name,int Totalworking,int overtime)
  {
	this.ID=ID;
	this.name=name;
	this.Totalworking=Totalworking;
	this.overtime=overtime;
  }
  void DisplayInfo()
  {
	System.out.println(ID+" "+name+" "+Totalworking+" "+overtime);
  }

}
class OverTime
{	 Employee e;
   void setEmployee(Employee emp[])
   {	e=emp;
   }
   void calculateOvertime()
   {	  int overtimepay=e.overtime * 50;

					System.out.println("OverTime Pay is "+overtimepay);
   }
}
public class EmployeeOverTimeApp
{
	public static void main(String []args)
	{
		 Scanner sc=new Scanner(System.in);
		 Employee e[]=new Employee[5];
		 System.out.println("Enter Employee Id Name TotalWonkingHours Overtime ");
		 for(int i=0;i<e.length;i++)
		 {
			 e[i]=new Empl
		 }
	}
}