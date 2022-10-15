import java.io.*;
import java.util.*;
class matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        int col=s.nextInt();
        int[][] arr1=new int[rows][col];
        int[][] arr2=new int[rows][col];
        int[][] sub=new int[rows][col];
       int i,j;
        System.out.println("Enter the first matrix:");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                arr1[i][j]=s.nextInt();
            }
        }
         System.out.println("Enter the second matrix:");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                arr2[i][j]=s.nextInt();
            }
        }
         for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                sub[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        System.out.println("The sub is: ");
          for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
               System.out.print(sub[i][j]+"  ");
            }
             System.out.print("\n");
        }
        
    }
}
