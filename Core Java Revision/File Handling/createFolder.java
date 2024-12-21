import java.io.*;
public class createFolder
{
 public static void main(String []args)
 {
    File f=new File("C:\\dummy");
    if(f.exists())
    {
     System.out.println("Folder is Already Present");
    }
    else
    {
      boolean b=f.mkdir();
      if(b)
      {
        System.out.println("Folder is Created");
      }
      else
      {
        System.out.println("Some Problem is there");
      }
    }
 }
}