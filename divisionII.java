import java.io.*;
public class Reverse {

  public static void main(String[] args)throws Exception
  {
      int mid,j,i;
    DataInputStream d = new DataInputStream(System.in); 
    System.out.print("Enter the divident:");
    int a=Integer.parseInt(d.readLine());
    System.out.print("Enter the  divisor:");
    int b=Integer.parseInt(d.readLine());
    for( i=0;a>=b;i++)
    {
       a=a-b;
    }
    
   System.out.println("The quatient is: "+i);
   System.out.println("The remainder is: "+a);
  }
}
