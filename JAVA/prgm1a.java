import java.util.Scanner;

class student
{
    String name;
    int rollno;
    float mark;
    
    void showDetails()
    {
      System.out.println("this is non static method");
      System.out.println(rollno+"--"+ name+"--" + mark);
    }
    
     static void show(student s)
    {
      System.out.println("this is static method");
      System.out.println(s.rollno+"--"+ s.name+"--" + s.mark);
    }
    
}

class prgm1a
{
  public static void main(String a[])
   {
     Scanner scan =new Scanner(System.in);
     student obj = new student();
     System.out.println("enter the roll no:");
     obj.rollno=scan.nextInt();
     scan.nextLine();
     System.out.println("enter the name:");
     obj.name=scan.nextLine();
     System.out.println("enter the mark:");
     obj.mark=scan.nextFloat();
     
     obj.showDetails();  //calling non-static method
     student.show(obj);  //calling static method
     
     
   }
}
