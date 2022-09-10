
import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
        int a=0,b=1;
       DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter the limit:");
       int n=Integer.parseInt(d.readLine());
       for (int i = 1; i <= n; ++i)
       {
          System.out.print(a + ", ");
          int c = a+b;
          a=b;
          b=c;
       }
   }
}
