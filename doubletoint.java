import java.io.*;
class demo {
  public static void main(String[] args)throws IOException
  {

    DataInputStream s=new DataInputStream(System.in);
    System.out.println("Enter the value:");
    double a =Double.parseDouble(s.readLine());
     System.out.println("Enter the value:");
    double b =Double.parseDouble(s.readLine());
    int c = (int)a;
    int d =(int) b;

    System.out.println("The integer value is :"+c);    
    System.out.println("The integer value is :"+d);    
  }
}
