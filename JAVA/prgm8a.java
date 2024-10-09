/*Program to create a class for Employee having attributes eNo, eName eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects. */

import java.util.Scanner;
class employee
{

  int eno;
  String ename;
  float esalary;
  
  
 employee( int eno,String ename,float esalary)
{

  this.eno=eno;;
  this.ename=ename;
  this.esalary=esalary;
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
    Scanner s=new Scanner(System.in);
   System.out.println("enter employee number :");
   eno =  s.nextInt();
   s.nextLine();
   System.out.println("enter employee name :");
   ename =  s.nextLine();
   System.out.println("enter employee salary :");
   esalary =  s.nextFloat();
   s.nextLine();
    
    emp[0]= new employee(eno,ename,esalary)  
 
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
/*
--------------------------------------------------
output
----------------------------------------------------------------------
no of employees:
2
enter employee number :
101
enter employee name :
anju
enter employee salary :
100000
enter employee number :
102
enter employee name :
helna
enter employee salary :
2000 
eno of employee to search:
101
101:anju:100000.0

