//create a class product with attribute name,code and price and display the product detail having lowest price

import java.util.Scanner;
class product
{
  String pcode;
  String pname;
  int price;
  
 int getDetails()
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter pcode: ");
     pcode=s.nextLine();
     System.out.println("enter pname: ");
     pname=s.nextLine();
     System.out.println("enter price: ");
     price=s.nextInt();
     
     return price;
  }
  
  void display()
  {
     System.out.println(pname+" | "+pcode +" | $"+price);
     
  }
  
}

 class prgm2
 {
 
  public static void main(String a[])
  {
  
    product p1 = new product();
    product p2 = new product();
    product p3 = new product();
    
     
     int price1=p1.getDetails();
     int price2=p2.getDetails();
     int price3=p3.getDetails();
  
   System.out.println("lowest price is: ");
   System.out.println("-------------------");
      
   if ((price1<price2) && (price1<price3))
      p1.display();
      
   else if ((price2<price1) && (price2<price3))
     p2.display();
     
   else  if((price3<price1) && (price3<price2))
     p3.display();
  } 
 }
