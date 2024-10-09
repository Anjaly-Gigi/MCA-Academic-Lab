// Area of different shapes using overloaded functions 

class shapes
{
  public void area(int rad )
  {
   System.out.println("area of circle is :"+3.14*rad*rad);
  }
  
   public void area(int l ,int b)
  {
   System.out.println("area of rectangle is :"+l*b);
  }
}

class prgm9
{
 public static void main(String arg[])
 {
    shapes obj = new shapes();
    obj.area(2);
    obj.area(3,4);
 }
}
