import java.io.*;
import java.util.*;
class demo{
    public static void main(String ar[]) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter a : ");
        int a=Integer.parseInt(d.readLine());
        System.out.println("Enter b : ");
        int b=Integer.parseInt(d.readLine());
        System.out.println("Enter c : ");
        int c=Integer.parseInt(d.readLine());
        if((a>b)&&(a>b))
              System.out.println("a is big");
        else if((b>a)&&(b>c))      
              System.out.print("b is big");
        else
              System.out.print("c is big");
    }
}
    
