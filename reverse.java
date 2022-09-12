import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter the number :");
       int n=Integer.parseInt(d.readLine());
       int r,t=0;
     while (n!=0) {
         r=n%10;
         t=t*10+r;
         n/= 10;
         
    }
    System.out.println("The reverse is: " + t);
}
}
