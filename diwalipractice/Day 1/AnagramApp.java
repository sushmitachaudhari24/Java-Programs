class Anagram
{
  private int a[],b[];
  Anagram(int a[])
  {
   this.a=a;
  }
  Anagram(int a[],int b[])
  {
   this.a=a;
   this.b=b;
  }


  public void checkanagram()
  {
    if(a.length!=b.length)
    {
     System.out.println("Array Are not anagram");
    }
    else
    { boolean bl=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
             if(a[i]!=b[j])
             {
              bl=true;
             }
             else{
				 bl=false;
			     }
             }
        }
        if(bl==false)
        {
			System.out.println("Array is Anagram");
		}
    }
  }
}
public class AnagramApp
{
 public static void main(String []args)
 {
   int a[]=new int[]{10,20,30,40,50};
   int b[]=new int[]{50,40,30,20,10};
   Anagram ag= new Anagram(a,b);
   ag.checkanagram();
 }
}