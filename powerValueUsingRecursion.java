import java.io.*;
import java.util.*;
class demo {
   static int b=1;
    public static int pow1(int a,int n)
    {
       if(n==0)
         return 1;
        else{
            b=b*a;
            pow1(a,n-1);
            return b;
        }     
    }
    public static void main(String[] args) {
        System.out.println("Enter the base: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the power: ");
        int n=sc.nextInt();
        int ans=pow1(a,n);
        System.out.print(ans);
    }
}
