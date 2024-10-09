//Program to Sort strings

import java.util.Scanner;

class prgm6
{
 public static void main(String arg[])
 {
   Scanner s = new Scanner(System.in);
   
   System.out.println("enter the size of array:");
   int size = s.nextInt();
   s.nextLine();
   
   String [] arr = new String[size];
   for(int i=0;i<size;i++)
   {
    System.out.println("enter the string " + (i+1) + ":");
    arr[i]=s.nextLine();
   } 
  
  String temp;
  
  for(int i=0;i<size;i++)
  {
   for(int j=i+1;j<size;j++)
   {
     if(arr[i].compareTo(arr[j])>0)
     {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     } 
   }
  }
 
   System.out.println("sorted string:");
   for(int i=0;i<size;i++)
   {
   System.out.println(arr[i]);
  
   } 
 }
}

/* output
---------------------------------------------------------------------------------------------------
enter the size of array:
4
enter the string 1:
harisa
enter the string 2:
anju
enter the string 3:
binet
enter the string 4:
serah

sorted string:
--------------
anju
binet
harisa
serah
*/
