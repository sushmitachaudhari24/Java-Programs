import java.io.*;
public class CountCharsWordsLines
{
  public static void main(String []args) throws Exception
  {
     FileReader fr=new FileReader("C:\\Test\\JavaDemo\\abc.txt");
     BufferedReader br=new BufferedReader(fr);
     int data ,ccount=0,wcounts=0,lcount=0;
     String str="";
     //count charectors
     while((data=fr.read())!=-1)
     {
      ccount++;
      str=str+((char)data);
     }
     System.out.println("Total Charectors Are "+ccount);
     //count Words
     String words[]=str.split(" ");
     for(String word :words)
     {
		 wcounts++;
	 }
	 System.out.println("Total Words are "+wcounts);
	/* // count lines
  String d;
      while((d=br.readLine())!=null)
      {
		  System.out.println(d);
		  Thread.sleep(1000);
		  lcount++;
	  }
	  System.out.println("Total Number of Lines are "+lcount+"\ndata "+d);
	  */
  }
}