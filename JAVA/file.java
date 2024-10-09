import java.io.*;


public class file
{
  public static void main(String arg[])
  {
 
   File myfile= new File("file1.txt");
   try
   {
   myfile.createNewFile();
   }
   catch(IOException e){                                  //creating a file
      
      System.out.println("unable to create");
       e.printStackTrace();
-----------------------------------------------------------------------------------------------------      
    try
      {
      FileWriter fw = new FileWriter("file1.txt");
      fw.write("this is my writing");
      fw.close();                                          //writing to a file
      }
       catch(IOException e){
          System.out.println("unable to write");
          e.printStackTrace();
          }     
          
        File myfile= new File("file1.txt");   
 ------------------------------------------------------------------------------------------------------  
         try
      {
          FileReader fr = new FileReader("file1.txt");
          BufferedReader br = new BufferedReader(fr);
          String line = br.readLine();
          while(line !=null)
          {
            System.out.println(line);
            break;
          }
          fr.close();                                          //reading to a file
      }
       catch(IOException e){
          System.out.println("unable to write");
          e.printStackTrace();
          }
          
  }
}
