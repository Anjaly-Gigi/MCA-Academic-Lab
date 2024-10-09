//exception

import java.util.Scanner;

class neg_exception extends Exception
{
  neg_exception(String msg)
  {
    super(msg);
  }
}

class prgm14
{
   public static void main(String arg[])
   {
      int n,a;
      int avg=0;
      Scanner s = new Scanner(System.in);
      System.out.println("enter the size of array");
      n = s.nextInt();
      System.out.println("enter the elements of array");
      for(int i=0;i<n;i++)
      {
         a=s.nextInt();
         
         try
         {
            if(a<0)
            { 
              --i;
              throw new neg_exception("reenter your number!! its a negative number");
            }
            else
            {
              avg+=a;
            }
         }
         
         catch(neg_exception e){
             System.out.println(e);
         }
      }
      System.out.println("average is" +avg/n);
   }
}
