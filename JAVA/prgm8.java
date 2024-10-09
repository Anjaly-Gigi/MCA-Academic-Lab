/*Program to create a class for Employee having attributes eNo, eName eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects. */

import java.util.Scanner;
class employee
{

  int eno;
  String ename;
  float esalary;
  
 void getinfo()
 {
   Scanner s=new Scanner(System.in);
   System.out.println("enter employee number :");
   eno =  s.nextInt();
   s.nextLine();
   System.out.println("enter employee name :");
   ename =  s.nextLine();
   System.out.println("enter employee salary :");
   esalary =  s.nextFloat();
 } 
  
}

class prgm8
{
   public static void main(String arg[])
  {
   Scanner s=new Scanner(System.in);
   System.out.println("no of employees:");
   int n =  s.nextInt();
   s.nextLine();
   
   employee emp[]= new employee[10];
   
   for(int i=0;i<n;i++)
   {
     emp[i] = new employee();
     emp[i].getinfo();
   }
   
    System.out.println("eno of employee to search:");
    int search_eno =  s.nextInt();
    
    
   for(int i=0;i<n;i++)
   {
     if(emp[i].eno == search_eno )
     {
       System.out.println(emp[i].eno +":"+emp[i].ename+":"+emp[i].esalary);
     }
   }
   
   
  }
}
