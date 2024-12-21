import java.io.*;
public class CreateFile
{
  public static void main(String []args)
  {
	try
    {
      File f=new File("C:\\dumy\\sample1.txt");
      boolean b=f.createNewFile();
      if(b)
      {
        System.out.println("File is Created "+f.getName());
      }
      else
       {
        System.out.println("File/path is Exists");
       }

    }
     catch(Exception e)
     {
       System.out.println("Error is "+e);
     }




  }
}