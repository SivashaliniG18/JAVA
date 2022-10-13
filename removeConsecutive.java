import java.io.*;
import java.util.*;
class demo
{
    public static void main(String aar[])
    {
        int k=0,i;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[20];
         int b[]=new int[20];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int j=0;
        for(i=0;i<n;i++)
        {
            if(a[i]!=j)
            {
                b[k++]=a[i];
            }
            j=a[i];
        }
        for(i=0;i<k;i++)
        {
            System.out.print(b[i]);
        }
    }
}
