import java.util.*;
class Table
{
  int num;
  void setNum(int n)
  {
   num=n;
  }
  void showTable()
  {
     for(int i=1;i<=10;i++)
     {
       System.out.println(num+" * "+i+" = "+(num*i));
     }
  }
}
 public class TableApp
 {
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     Table t=new Table();
     System.out.println("Enter A number");
     int number=sc.nextInt();
     t.setNum(number);
     t.showTable();
   }
 }