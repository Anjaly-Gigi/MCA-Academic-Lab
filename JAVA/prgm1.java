/*# A PROGRAM TO DEFINE THE DIFFERENCE BETWEEN STATIC AND NON-STATIC METHOD
#
# static variable is a class member not an object member that is common/shared to all object of the class and can be accessed by using className.staticVariableName=value;
#
# Non-static(instance) method                              static method  
# -------------------------------                      ---------------------------                   
#  -> belongs to instance of class                          -> belongs to class
#
#  -> can access instance method and                        -> can access only static variable and
#     variable and static method and                           method directly but can access instance
#     variable                                                 variable with the help of obj reference
#    
#  -> called using instance                                 -> called using the classname
*/

class Mobile
{
  String brand;
  int price;
  static String name;
  
  public void show()                                    //non-static method
  {
  System.out.println(brand + ":"+ price+ ":" +name);
  }
  
  public static void show1(Mobile m1)                 //static method             
  {
  System.out.println(m1.brand + ":"+ m1.price+ ":" +name);
  }
  
}

public class prgm1
{
  public static void main(String a[])
  {
     Mobile m1= new Mobile();
     m1.brand="apple";
     m1.price=1700;
     m1.name="ios";
     
     Mobile m2 = new Mobile();
     m2.brand="samsung";
     m2.price=1500;
     m2.name="android";
     
     m1.name="phone"; 
    
     m1.show();     //calling non-static method
     m2.show();
     Mobile.show1(m1);  //calling static method
     
     
  }
}
