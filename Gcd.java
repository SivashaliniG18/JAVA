
import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
       int gcd = 1;
       DataInputStream d=new DataInputStream(System.in);
       System.out.println("Enter the numbers:");
       int a=Integer.parseInt(d.readLine());
       int b=Integer.parseInt(d.readLine());
       for (int i = 1; i <= a && i <= b; ++i) 
       {
            if (a % i == 0 && b% i == 0)
                gcd = i;
       }

    System.out.println("GCD of " + a +" and " + b + " is " + gcd);
  }
}
   
