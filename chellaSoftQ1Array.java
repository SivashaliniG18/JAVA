import java.io.*;
import java.util.*;
class demo {
    public static void main(String[] args) {
        System.out.println("Enter the elements : ");
        Scanner sc=new Scanner(System.in);
        int i,j,sum;
        int n=sc.nextInt();
        int input=sc.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
           a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                sum=a[i]+a[j];
               if(input==sum) 
               {
                   System.out.print(a[i]+","+a[j]);
               }
            }
        }
    }
}
