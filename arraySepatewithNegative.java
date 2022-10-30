import java.io.*;
import java.util.*;
class demo{
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        int i;float p=0,ne=0,nu=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        
        for(i=0;i<n;i++)
           a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]>0)
               p++;
            else if(a[i]<0)
              ne++;
            else
              nu++;
        }
        System.out.print(p/n+","+ne/n+","+nu/n);
        
    }
}
