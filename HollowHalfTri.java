import java.util.*;
public class HollowHalfTri
{
    public static void main(String []args)
    {
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=5;j++)
         {
            if(j==1 ||j==i || i==5)
            {
            System.out.print(j+" ");
            }
            else{
             System.out.print("  ");
            }
         }
          System.out.println();
      }
    }
}