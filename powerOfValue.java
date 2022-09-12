import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter the number :");
       int a=Integer.parseInt(d.readLine());
       System.out.print("Enter the exponent :");
       int n=Integer.parseInt(d.readLine());
      int t=1;
      if(n!=0)
      {
     while (n!=0) {
        t=t*a;
         n--;
    }
        System.out.println("The value is : "+t);
      }
      else if(n==0)
      {
          System.out.print("the value is : 1" );
      }
