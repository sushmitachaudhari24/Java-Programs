import java.io.*;
import java.util.*;
class AccountInfo implements Serializable
{
 private String uname;
 private String pword;
 private String atype;

 public void setuname(String uname)
 {
  this.uname=uname;
 }
 public String getuname()
 {
   return uname;
 }
  public void setpword(String pword)
  {
   this.pword=pword;
  }
  public String getpword()
  {
    return pword;
 }
  public void setatype(String atype)
  {
   this.atype=atype;
  }
  public String getatype()
  {
    return atype;
 }
}
public class AccountApp
{
 public static void main(String []args) throws Exception
 {
  FileOutputStream fout =new FileOutputStream("C:\\Test\\JavaDemo\\demoAccount.txt",true);
  ObjectOutputStream oout=new ObjectOutputStream(fout);
  Scanner sc=new Scanner(System.in);
  AccountInfo a[]=new AccountInfo[2];
 for(int i=0;i<a.length;i++)
 {
	 a[i]=new AccountInfo();
	 System.out.println("Enter Username,Password,AccountType");
	 String un=sc.next();
	 String pw=sc.next();
	 String at=sc.next();
	 a[i].setuname(un);
	 a[i].setpword(pw);
	 a[i].setatype(at);
	  oout.writeObject(a[i]);
 }
  oout.close();
  System.out.println("SuccessFully Write ....");
  FileInputStream fin=new FileInputStream("C:\\Test\\JavaDemo\\demoAccount.txt");
  ObjectInputStream oin=new ObjectInputStream(fin);
  System.out.println("Here is the Data Read from File");
AccountInfo b[]=new AccountInfo[3];
  for(int i=0;i<b.length;i++)
  {
   b[i]=(AccountInfo)oin.readObject();
    System.out.println(b[i].getuname()+"\t"+b[i].getpword()+"\t"+b[i].getatype());
  }
   System.out.println("SuccessFully Read ....");
 }
}