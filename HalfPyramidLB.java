import java.util.*;
public class HalfPyramidLB
{
   public static void main(String []args)
   {
       for(int i=0;i<6;i++)
       {
          for(int j=0;j<6;j++)
          {
             if(i>=j)
             {
              System.out.print("*");
             }
             else
             {
                System.out.print(" ");
             }
          }
          System.out.println();
       }
   }
}