/*Create an interface having prototypes of functions area() and perimeter(). Create two
classes Circle and Rectangle which implements the above interface. Create a menu driven
program to find area and perimeter of objects. */

import java.util.Scanner;

interface shapes
{
  void get();
  void area();
  void perimeter();
}

class circle implements shapes
{
  int r;
  public void get()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter the radius");
    r = s.nextInt();
   
  }
  
  public void area()
  {
   System.out.println("area is:"+3.14*r*r);
  }
  
  public void perimeter()
  {
   System.out.println("perimeter is:"+2*3.14*r);
  }
  
}

class rectangle implements shapes
{  
   int l,b;
  public void get()
  {
   Scanner s= new Scanner(System.in);
   System.out.println("enter length");
   l = s.nextInt();
   s.nextLine();
   System.out.println("enter breadth");
   b = s.nextInt();
   
  }
  
  public void area()
  {
   System.out.println("area is:"+(l*b));
  }
  
  public void perimeter()
  {
   System.out.println("perimeter is:"+2*(l+b));
  }
  
}
class prgm12a 
{
  public static void main(String arg[])
  {
   Scanner s=new Scanner(System.in);
    circle c=new circle();
    rectangle r=new rectangle();
    c.get();
    r.get();
    
    while(true)
    {
    System.out.println("menu");
    System.out.println("1.area of circle\n 2.perimeter of circle\n 3.area of rectangle\n 4.perimeter of rectangle\n 5.exit");
    System.out.println("enter your choice");
    int ch = s.nextInt();
    switch(ch)
    {
      case 1: c.area();
              break;
      case 2: c.perimeter();
              break;
      case 3: r.area();
              break;
      case 4: r.perimeter();
              break;        
      case 5: System.out.println("exiting....");
              return;       
    
    }   
    }
  }
}

/*
enter the radius
2
enter length
3
enter breadth
4
menu
1.area of circle
 2.perimeter of circle
 3.area of rectangle
 4.perimeter of rectangle
 5.exit
enter your choice
1
area is:12.56
menu
1.area of circle
 2.perimeter of circle
 3.area of rectangle
 4.perimeter of rectangle
 5.exit
enter your choice
2
perimeter is:12.56
menu
1.area of circle
 2.perimeter of circle
 3.area of rectangle
 4.perimeter of rectangle
 5.exit
enter your choice
4
perimeter is:14
menu
1.area of circle
 2.perimeter of circle
 3.area of rectangle
 4.perimeter of rectangle
 5.exit
enter your choice
3
area is:12
menu
1.area of circle
 2.perimeter of circle
 3.area of rectangle
 4.perimeter of rectangle
 5.exit
enter your choice
5
exiting....
*/


