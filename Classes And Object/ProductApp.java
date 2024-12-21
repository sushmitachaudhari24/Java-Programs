import java.util.*;
 class Product
{
 private int id;
 private int sal;
 private String name;

   public void setid(int id)
   {
     this.id=id;
   }
   public int getid()
   {
    return id;
   }
   public void setsal(int sal)
   {
     this.sal=sal;
   }
   public int getsal()
   {
    return sal;
   }
   public void setname(String name)
   {
     this.name=name;
   }
   public String getname()
   {
     return name;
   }
}
 class shop
{
    private Product p;

    public void addNewProduct(Product prod)
   {
     p=prod;
   }
   public void showProduct()
   {
     System.out.println(p.getid()+"\t"+p.getname()+"\t"+p.getsal());
   }
}

public class ProductApp
{
    public static void main(String []args)
    {
        Product p=new Product();
        shop s=new shop();
        p.setid(1);
        p.setname("ABDS");
        p.setsal(23987);
        s.addNewProduct(p);
        s.showProduct();
    }
}