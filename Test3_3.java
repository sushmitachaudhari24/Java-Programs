 public class Test3_3
 {
   public static void main(String []args)
   {
     for(int i=1;i<=6;i++)
     {
       for(int j=0;j<13;j++)
       {
         if(i>j)
         {
          System.out.print(j);
         }
         else if(j>12-i)
         {
           System.out.print(12-j);
 		 }
         else{
            System.out.print(" ");
         }
       }
       System.out.println();
     }
   }
 }