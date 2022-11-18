import java.io.*;
import java.util.*;
class demo {
    public static void main(String[] args) {
        System.out.println("Enter the limit: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i,j,s,r;
        for(i=0;i<n;i++)
           a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s=0;
            while(a[i]>0)
            {
                r=a[i]%10;
                s=(s*10)+r;
                a[i]/=10;
            }
            b[i]=s;
        }
    
    for(i=0;i<n;i++)
       System.out.print(b[i]+" ");
    }
    
}
