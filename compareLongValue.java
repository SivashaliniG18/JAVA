import java.io.*;
import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextInt();
        long ke=s.nextInt();
        long a[]=new long[20];
        int i,k=0;long r,rem=0,re,nu=0,c=0;
        while(n>0)
        {
            r=n%10;
            a[k]=r;
            n=n/10;
            k++;
            
        }
        for(i=k-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
        rem=ke%10;
         ke=ke/10;
        System.out.print(rem);
         System.out.print(ke);
        for(i=k-1;i>0;i--)
        {
            if(rem==a[i])
            {
                if(ke==a[i-1])
                {
                  c=1;
                  break;
                }
            }
            else
               continue;
           
        }
        if(c==1)
           System.out.print("yes");
           else
            
                System.out.print("no");
            
    }
}
