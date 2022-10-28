import java.io.*;
import java.util.*;
class demo{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int i,j,k,space;
        space=row;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<space;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
               System.out.print(" "+k);
            space--;
            System.out.print("\n");
        }
    }
}
