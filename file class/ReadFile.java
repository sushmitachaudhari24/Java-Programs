import java.io.*;
public class ReadFile
{
  public static void main(String []args)  throws Exception
  {
   FileReader fr=new FileReader("C:\\Test\\JavaDemo\\JavaContaint.txt");
   int data;
   while((data=fr.read())!=-1)
   {
     System.out.print((char)data);
   }
  }
}