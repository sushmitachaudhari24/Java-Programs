import java.util.*;
public class JagArray
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int jag[][]=new int[][]{
                             {1,2,3},
                             {4,5},
                             {6,7,8,9,19}
                            };

    System.out.println(" Array Elements  \n");
    for(int i=0;i<jag.length;i++)
    {
      for(int j=0;j<jag[i].length;j++)
      {
        System.out.print(jag[i][j]+" ");
      }
      System.out.println();
    }
  }
}