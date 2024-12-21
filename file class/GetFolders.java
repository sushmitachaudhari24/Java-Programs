import java.io.*;
public class GetFolders
{
   public static void main(String []args)
   {
     File f=new File("c:\\Test");
      File list[]=f.listFiles();
     /* for(int i=0;i<list.length;i++)
      {
		  System.out.println(list[i]);
	  }*/

	  for(int i=0;i<list.length;i++)
	  {
		  /* if(list[i].isDirectory())
		   {
			   System.out.println(list[i]);
		   }*/
		   if(list[i].isFile())
		   {
			    System.out.println(list[i]);
		   }

	  }
   }
}