import java.io.*;
import java.util.*;
class demo{
    public static void main(String ar[]) throws Exception
    {
        System.out.print("ax+bx+c=0 is the quadretic equation");
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter a : ");
        float a=Float.parseFloat(d.readLine());
        System.out.println("Enter b : ");
        int b=Integer.parseInt(d.readLine());
        System.out.println("Enter c : ");
        float c=Float.parseFloat(d.readLine());
        float x=((b*b)-(4*a*c));
        if(x==0)
        {
            float root=-b/2*a;
            System.out.print("Root1 =Root2:"+root);
        }
        else
        {
            float real=-b/(2*a);
            double imag=Math.sqrt(-x)/(2*a);
           System.out.println("Root1 is  : "+real+"+"+imag+"i");
           System.out.println("Root2 is  : "+real+"-"+imag+"i");
        }
    }
}
