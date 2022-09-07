import java.io.*;
import java.util.*;
class demo{
    public static void main(String a[]) throws Exception
    {
        int c;
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the first number : ");
        int n1=Integer.parseInt(d.readLine());
        System.out.print("Enter the second number:");
        int n2=Integer.parseInt(d.readLine());
        c=n1;
        n1=n2;
        n2=c;
        System.out.println("first number :"+n1);
        System.out.print("second :"+n2);
    }
}
    
