/*Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
and static nested class RAM (memory, manufacturer). Create an object of CPU and print
information of Processor and RAM. */

class cpu
{
  float price;
  
  cpu(float p)
  {
    price=p;
  }
  
   void display()
   {
      System.out.println("price: "+price);
   }
  
  class processor
  {
    int cores_no ;
    String manufacturer;
    
    processor(int n , String m)
    {
      cores_no=n;
      manufacturer=m;
    }
    
    void pdisplay()
   {
      System.out.println("no of cores : " +cores_no);
      System.out.println("manufacturer : " +manufacturer);
   }
  }  
   static class ram
  {
    String memory ;
    String manufacturer;
    
    ram(String x , String m)
    {
      memory= x;;
      manufacturer=m;
    }
    
    void rdisplay()
   {
      System.out.println("memory : " +memory);
      System.out.println("manufacturer : " +manufacturer);
   }
    
  }
 }

class prgm5
{
  public static void main(String arg[])
  {
    cpu c = new cpu(100);
    
    cpu.processor p = c.new processor(7,"abc");
    cpu.ram r = new cpu.ram("16gb","xyz");
    p.pdisplay();
    r.rdisplay();
    c.display();  
  }
}


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  output
no of cores : 7
manufacturer : abc
memory : 16gb
manufacturer : xyz
price: 100.0

  
