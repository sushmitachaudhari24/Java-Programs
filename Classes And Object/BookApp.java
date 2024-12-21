import java.util.*;
class Book
{
 private int bid;
 private String bname;
 private int bprice;

public void setId(int id)
{
bid=id;
}
public void setName(String name)
{
bname=name;
}
public void setPrice(int price)
{
bprice=price;
}

 public int getId()
 {
    return bid;
 }
 public String getName()
 {
    return bname;
 }
 public int getPrice()
 {
 return bprice;
 }
}
  public class BookApp
  {
     public static void main(String []args)
     {
       Book b[]=new Book[3];
    //   Book b1[]=new Book[3];
    Book temp;
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<b.length;i++)
       {

         b[i]=new Book();

         System.out.println("Enter Book Id ");
         int bid=sc.nextInt();
         System.out.println("Enter Book Name");
         String bname=sc.next();
         System.out.println("Enter Book Price");
         int bprice= sc.nextInt();
         b[i].setId(bid);
         b[i].setName(bname);
         b[i].setPrice(bprice);
       }
       System.out.println("----------------------------------------------------------\nRecords of Book\n----------------------------------------------------------\nBook_ID\t\tBook_Name\tBook_Price");
       for(int i=0;i<b.length;i++)
       {
          System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getPrice());
       }

        System.out.println("----------------------------------------------------------\nRecords of Book In decending Order\n----------------------------------------------------------\nBook_ID\t\tBook_Name\tBook_Price");
	          for(int i=0;i<b.length;i++)
	          {
				   for(int j=i+1;j<b.length;j++)
				   {
					   if((b[i].getPrice())<(b[j].getPrice()))
					   {
						   temp=b[i];
						   b[i]=b[j];
						   b[j]=temp;

				        }
				   }
              }
               for(int i=0;i<b.length;i++)
			         {
			            System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getPrice());
       }
     }
  }