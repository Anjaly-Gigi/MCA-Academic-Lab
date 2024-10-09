//abstact class

abstract class person
{
   
  abstract void method1();              //abstract method
   
   void method2()                       //regular method
   {
    System.out.println("this is regular method in abstract class");
   }
}

class women extends person
{
  public void method1()
  {
    System.out.println("implementing abstract method"); //implementation of abstract method in subclass
  }
}
class prgm12
{
  public static void main (String arg[])
  {
    women obj = new women();
    obj.method1(); 
    obj.method2();

  }   
}





