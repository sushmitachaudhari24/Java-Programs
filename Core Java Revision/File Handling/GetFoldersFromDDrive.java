import java.io.*;
public class GetFoldersFromDDrive
{
 public static void main(String []args)
 {
  File f=new File("F:\\");
  File list[]=f.listFiles();
  System.out.println("All Folders from D Drive");
  for(int i=0;i<list.length;i++)
  {
	  if(list[i].isDirectory())
	  {
       System.out.println(i+"-->"+list[i]);
      }
  }
 }
}