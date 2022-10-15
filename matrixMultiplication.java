import java.io.*;
import java.util.*;
class matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r1=s.nextInt();
        int c1=s.nextInt();
        int r2=s.nextInt();
        int c2=s.nextInt();
        int[][] arr1=new int[r1][c1];
        int[][] arr2=new int[r2][c2];
        int[][] product=new int[r1][c2];
       int i,j,k;
        System.out.println("Enter the first matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                arr1[i][j]=s.nextInt();
            }
        }
         System.out.println("Enter the second matrix:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                arr2[i][j]=s.nextInt();
            }
        }
        for( i = 0; i < r1; i++) {
            for ( j = 0; j < c2; j++) {
                for (k = 0; k < c1; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("The sub is: ");
          for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
               System.out.print(product[i][j]+"  ");
            }
             System.out.print("\n");
        }
        
    }
}
