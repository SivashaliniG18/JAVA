import java.io.*;
import java.util.*;
class demo {
    public static void main(String[] args) {
        int i,n,j,k=0,t=0;
        System.out.println("Enter the number of elements : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int s[]=new int[10];
        System.out.println("Enter the values : ");
        for(i=0;i<n;i++)
           arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=2;j<n;j++)
            {
               if(arr[i]%j==0)
                  k=1;
            }
            if(k<1)
            {
                s[t]=arr[i];
                t++;
            }
         
        }
        System.out.println("Prime values are values : ");
        for(i=0;i<t;i++)
        {
            System.out.print(s[i] + " ");
        }
    }
}
