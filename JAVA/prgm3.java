//Read 2 matrices from the console and perform matrix addition

import java.util.Scanner;

class matrix
{
  int [][] getMatrix(int r, int c)
  {
     Scanner scan = new Scanner(System.in);
     
     int [][] mx = new int[r][c];
     
     for(int i=0;i<r;i++)
     {
       for(int j=0;j<c;j++)
       {
         mx[i][j]=scan.nextInt();
       }
     }
     
     return mx;
  }

 int [][] sum(int[][] a , int[][] b , int r , int c)
{
   int [][] smx = new int[r][c];
     
     for(int i=0;i<r;i++)
     {
       for(int j=0;j<c;j++)
       {
         smx[i][j]= a[i][j]+b[i][j];
       }
     }
     
     return smx;
}

void display( int[][] a, int r , int c)
{
     
     for(int i=0;i<r;i++)
     {
       for(int j=0;j<c;j++)
       {
         System.out.print(a[i][j] +" ");
         
       }
       System.out.println();
     }
     
   
}

}

class prgm3
{
  public static void main(String [] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    matrix m = new matrix();
    
    int [][] a = new int [10][10];             
    int [][] b = new int [10][10];
    int [][] result = new int [10][10];
    
    System.out.println("enter the number of rows:");
    int r = scan.nextInt();
    scan.nextLine();
    
    System.out.println("enter the number of columns:");
    int c = scan.nextInt();
    scan.nextLine();
    
    System.out.println("matrix 1 is");
    a = m.getMatrix(r,c);
    
    System.out.println("matrix 2 is");
    b = m.getMatrix(r,c);
    
    System.out.println("sum of matrix is");
    result = m.sum(a,b,r,c);
    
    System.out.println("matrix 1 is");
    m.display(a,r,c);
    System.out.println("matrix 2 is");
    m.display(b,c,r);
    System.out.println("resultant matrix is");
    m.display(result,r,c);
       
  }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
output
enter the number of rows:
3
enter the number of columns:
3
matrix 1 is
1 1 1 1 1 1 1 1 1
matrix 2 is
2 2 2 2 2 2 2 2 2
sum of matrix is
matrix 1 is
1 1 1 
1 1 1 
1 1 1 
matrix 2 is
2 2 2 
2 2 2 
2 2 2 
resultant matrix is
3 3 3 
3 3 3 
3 3 3 


