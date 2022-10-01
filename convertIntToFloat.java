import java.io.*;
class demo {
  public static void main(String[] args)throws IOException
  {

    DataInputStream s=new DataInputStream(System.in);
    System.out.println("Enter the value:");
    int a =Integer.parseInt(s.readLine());
     System.out.println("Enter the value:");
    int b =Integer.parseInt(s.readLine());
    double c = a;
    double d = b;

    System.out.println("The float value is :"+c);    
    System.out.println("The float value is :"+d);    
  }
}
