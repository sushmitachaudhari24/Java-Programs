abstract class Animal
{
 abstract void makeSound();
}
class dog extends Animal
{
  void makeSound()
  {
     System.out.println("I am KUTRA");
  }
}
class cat extends Animal
{
  void makeSound()
  {
     System.out.println("I am MANJAR");
  }
}
public class AnimalApp
{

    public static void main(String []args)
    {
       dog d=new dog();
       d.makeSound();
       cat c=new cat();
       c.makeSound();
    }
}