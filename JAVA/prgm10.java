/*Create a class ‘Employee’ with data members Empid, Name, Salary, Address and
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the
properties of class employee and contain its own data members department, Subjects taught
and constructors to initialize these data members and also include display function to
display all the data members. Use array of objects to display details of N teachers. */

import java.util.Scanner;

class employee
{
  int eid;
  String ename;
  float esalary;
  String add;
 
 employee(int eid,String ename,float esalary,String add)
 {
   this.eid=eid;
   this.ename=ename;
   this.esalary=esalary;
   this.add=add;
  
 }
 
}

class teacher extends employee
{
  String dept;
  String subj;
  
  teacher(int eid,String ename,float esalary,String add,String dept,String subj)
  {
    super(eid,ename,esalary,add);
    this.dept=dept;
    this.subj=subj;
    
  }
  void display()
  {
  System.out.println(eid+":"+ename+":"+esalary+":"+add+":"+dept+":"+subj);
  }
  
}

class prgm10
{
   public static void main(String arg[])
   {
     int i;
     Scanner s = new Scanner(System.in);
     System.out.println("enter the number of teachers");
     int n = s.nextInt();
     s.nextLine();
     
     teacher t[] = new teacher[n];
     
     for (i =0;i<n;i++)
     {
       System.out.println("details of teachers"+(i+1));
       System.out.println("enter employee id :");
       int eid =  s.nextInt();
       s.nextLine();
       System.out.println("enter employee name :");
       String ename =  s.nextLine();
       System.out.println("enter employee salary :");
       float esalary =  s.nextFloat();
       s.nextLine();
       System.out.println("enter employee address :");
       String add =  s.nextLine();
       System.out.println("enter department :");
       String dept =  s.nextLine();
       System.out.println("enter subject taught :");
       String subj= s.nextLine();
       
       t[i] = new teacher(eid,ename,esalary,add,dept,subj);
     }
     
     System.out.println("\nDetails of Teachers:");
        for (teacher j: t)
         {
            j.display();
            System.out.println();
         }
    
   }
}
/*
output
--------------------------------------------------------------------
enter the number of teachers
2
details of teachers1
enter employee id :
11
enter employee name :
sanju
enter employee salary :
20000
enter employee address :
muvt
enter department :
mca
enter subject taught :
java
details of teachers2
enter employee id :
22
enter employee name :
lachu
enter employee salary :
50000
enter employee address :
klm
enter department :
mca
enter subject taught :
python

Details of Teachers:
11:sanju:20000.0:muvt:mca:java

22:lachu:50000.0:klm:mca:python
*/
