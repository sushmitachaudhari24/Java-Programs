import java.util.*;
class PersonalInfo
{ String name,mname,lname;
   PersonalInfo(String name,String middlename,String lastname)
   {
     this.name=name;
     mname=middlename;
     lname=lastname;
   }
}
class ProfessionalInfo extends PersonalInfo
{
	int id,salary;
	String skillset,des;
  ProfessionalInfo(int id,String des,int salary,String skillset,String name,String middlename,String lastname)
  {
    super(name,middlename,lastname);
    this.id=id;
    this.salary=salary;
    this.skillset=skillset;
    this.des=des;
  }
  public void show()
  {
    System.out.println("======Personal Information======");
    System.out.println("ID:"+id+"\nFirst name:"+name+"\nMiddle name:"+mname+"\nLast name:"+lname+"\nDesignation:"+des+"\nSalary:"+salary+"\nSkillSet:"+skillset);
  }
}
public class PersonalDetails
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Id First Name,Middle name, Last Name, designation,Salary ,Skillset");
   int id=sc.nextInt();
   String fn=sc.next();
   String mn=sc.next();
   String ln=sc.next();
   String desig=sc.next();
   int sal=sc.nextInt();
   String skill=sc.next();
   ProfessionalInfo p=new ProfessionalInfo(id,desig,sal,skill,fn,mn,ln);
   p.show();
  }
}