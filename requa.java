import java.io.*;
import java.util.*;
class demo{
    public static void main(String a[]) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the divident:");
        int n1=Integer.parseInt(d.readLine());
        System.out.print("Enter the divisor:");
        int n2=Integer.parseInt(d.readLine());
        int c=n1/n2;
        int r=n1%n2;
        System.out.print("The Quotient is :"+c);
        System.out.print("The Remainder is :"+r);
    }
}
