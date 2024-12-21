import java.util.*;
class Student
{
   int id,percent;
   String name;
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
   public void setPercent(int p)
   {
     percent=p;
   }
   public int getPercent()
   {
     return percent;
   }
}
public class StudentApp
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter How many Student Do you want to add:");
      int n=sc.nextInt();
      Student s[]=new Student[n];
      for(int i=0;i<s.length;i++)
      {
         s[i]=new Student();
         System.out.println((i+1)+".Enter Student ID name Percent");
         int id=sc.nextInt();
         String name=sc.next();
         int percent=sc.nextInt();
         s[i].setId(id);
         s[i].setName(name);
         s[i].setPercent(percent);
      }
      System.out.println("---------------------------------------------------------\n  StudId\tStudName\tPercent\n---------------------------------------------------------");
      for(int i=0;i<s.length;i++)
      {
        System.out.println((i+1)+"  "+s[i].getId()+"\t\t"+s[i].getName()+"\t\t"+s[i].getPercent());
      }
   }
}

