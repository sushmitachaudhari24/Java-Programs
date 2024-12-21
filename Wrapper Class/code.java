     //7.Demonstrate chaining methods by using StringBuffer and StringBuilder class methods
         class MC
               {
				  StringBuffer name;
				  MC setData(StringBuffer name)
				  {
					  this.name=name;
					  return this;
				  }
				  MC show()
				  {
					  System.out.println("middle method");
					  return this;
				  }
				  MC display()
				  {
					  System.out.println("name is :"+name);
					  return this;
				  }
			   }
			  public class code
			  {
				  public static void main(String args[])
				  {
					  System.out.println(new MC().setData(new StringBuffer("Sushmita")).show().display());
				  }
			  }