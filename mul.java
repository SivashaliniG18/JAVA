import java.io.*;
import java.util.*;
class demo{
    public static void main(String a[]) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the values:");
        float n1=Float.parseFloat(d.readLine());
        float n2=Float.parseFloat(d.readLine());
        float c=n1*n2;
        System.out.print("The addition of two number is :"+c);
    }
}
