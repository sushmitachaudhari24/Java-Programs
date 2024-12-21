import java.util.*;
class Square
{
   int n;
   void setValue(int x)
   {
     n=x;
   }
   void showSquare()
   {
     System.out.println("Square of a number is"+(n*n));
   }
}
public class SquareApp
{
   public static void main(String [] args)
   {
     Square s=new Square();
     
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter a number");
     int num=sc.nextInt();
     s.setValue(num);
     s.showSquare();
   }
}