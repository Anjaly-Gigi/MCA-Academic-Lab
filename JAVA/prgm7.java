//string manipulations

class prgm7
{
  public static void main(String arg[])
  { 
    String [] strArr = new String[50];
    
    String s="hello Anjaly";
    
     System.out.println("original string: "+s);
     System.out.println("string manu : " + s.length());
     System.out.println("string manu : " + s.toUpperCase());
     System.out.println("string manu : " +s.toLowerCase());
     System.out.println("string manu : " +s.charAt(3));
     System.out.println("string manu : " +s.indexOf("l"));
     System.out.println("string manu : " +s.concat(" Gigi"));
     System.out.println("string manu : " +s.replace("aly","u"));
     System.out.println("string manu : " +s.trim());
     System.out.println("string manu : " +s.equals("hello"));
     strArr= s.trim().split(" ");
     for(String i:strArr)
     {
       System.out.println(i);
     }
  }


}
/*
--------------------------------------------------------------------------------------
output
--------------------------------------------------------------------------------------
original string: hello Anjaly
string manu : 12
string manu : HELLO ANJALY
string manu : hello anjaly
string manu : l
string manu : 2
string manu : hello Anjaly Gigi
string manu : hello Anju
string manu : hello Anjaly
string manu : false
hello
Anjaly
*/
