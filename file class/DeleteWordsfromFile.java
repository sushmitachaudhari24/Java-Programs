import java.io.*;
import java.util.*;
public class DeleteWordsfromFile
{
  public static void main(String []args) throws Exception
  {
    FileReader fr=new FileReader("C:\\Test\\JavaDemo\\abc.txt");
    String str="";
    BufferedReader br=new BufferedReader(fr);
    FileWriter fw=new FileWriter("C:\\Test\\JavaDemo\\XYZ.txt");
    BufferedWriter bw= new
    // FileWriter w=new FileWriter("C:\\Test\\JavaDemo\\abc.txt",true);
   //BufferedWriter bw=new BufferedWriter(w);
    String data;
    int d;
    while((data=br.readLine())!=null)
    {
		
	}
    /*while((data=fr.read())!=-1)
    {
     str=str+((char)data);
    }
     StringBuffer str1=new StringBuffer(str);
    //char ch[]=str.toCharArray();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Word");
     String sword=sc.next();
     int ind=str1.indexOf(sword);
     System.out.println("Index of "+sword+" is "+ind);
     int inlen=ind+(sword.length());
     System.out.println("length + sword index "+inlhen);
     str1.delete(ind,inlen);
	 System.out.println("String is \n");

      fw.write(String.valueOf(str1));
      fw.newLine();
		 //System.out.print(str1);
		 w.close();
      fw.close();
      fr.close();
      */

  }
}