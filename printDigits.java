import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter the number :");
       int n=Integer.parseInt(d.readLine());
       int count=0;
     while (n!=0) {
         n/= 10;
         count++;
    }
    System.out.println("Number of digits: " + count);
}
}
