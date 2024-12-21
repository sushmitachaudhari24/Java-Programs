import java.io.*;
import java.util.*;
public class WriteFile
{
  public static void main(String []args) throws Exception
  {
    FileWriter f=new FileWriter("C:\\Test\\JavaDemo\\JavaContaint.txt",true);

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Data to write into File");
     String str=sc.nextLine();
     f.write(str);
     System.out.println("Data Saved. ");
     f.close();
  }
}