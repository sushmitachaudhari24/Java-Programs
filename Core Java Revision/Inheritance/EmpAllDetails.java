import java.util.*;
class PersonalInfo
{
 String name;
 String middlename;
 String lastname;
  PersonalInfo(String name,String middlename,String lastname)
  {
   this.name=name;
   this.middlename=middlename;
   this.lastname=lastname;
  }
}
class Professionalinfo extends PersonalInfo
{
int id,sal;
String des,skill;
 Professionalinfo(int id,String fname,String mname,String lname,String des,int sal,String skillset)
 {
	  super(fname,mname,lname);
   this.id=id;
   this.des=des;
   skill=skillset;
   this.sal=sal;
 }
 void show()
 {
  System.out.println("Employee Details--::--\n\nId :"+id);
  System.out.println("First_Name :"+name);
  System.out.println("Middle_Name :"+middlename);
  System.out.println("Last_Name :"+lastname);
  System.out.println("designation :"+des);
  System.out.println("Salary :"+sal);
  System.out.println("Skills :"+skill);
 }
}
public class EmpAllDetails
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Id,Firstname,MiddleName,lastName,Designation,Salary,Skills in the sequence");
     int id=sc.nextInt();
     String fname=sc.next();
     String mname=sc.next();
     String lname=sc.next();
     String des=sc.next();
     int sal=sc.nextInt();
     String skills=sc.next();
     Professionalinfo p=new Professionalinfo(id,fname,mname,lname,des,sal,skills);
     p.show();
   }
}

