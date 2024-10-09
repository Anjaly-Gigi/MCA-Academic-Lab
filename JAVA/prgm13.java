import graphics.*;

public class prgm13
{
  public static void main(String arg[])
  {
    int l=5,b=3,h=4;
    Rectangle r1=new Rectangle(l,b);
	  	   System.out.println("Area of Rectangle with length "+l+" and breadth "+b+" is : "+r1.area());
   
   Triangle t1=new Triangle(l,h);
	  	   System.out.println("Area of Triangle with length "+l+" and height "+h+" is : "+t1.area());
  }

}
