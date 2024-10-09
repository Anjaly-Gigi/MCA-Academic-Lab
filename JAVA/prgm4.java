//Add complex numbers 

class complex
{
 double real;
 double imag;
 
 complex(double a,double b)
 {
   real=a;
   imag=b;
 }
 
}

class prgm4
{
 public static void main(String arg[])
 {
  
  
  complex c1 = new complex(2.1,1.2);
  complex c2 = new complex(2.1,1.1);
  complex result;
  result=add (c1,c2);
  System.out.println("sum is : " +result.real + " + " +result.imag+ "i");
 } 
  public static complex add(complex p ,complex q)
  {
    complex res = new complex();
    
    res.real = p.real+q.real;
    res.imag =p.imag+q.imag;
      
  
  return res;
  }
 
}
