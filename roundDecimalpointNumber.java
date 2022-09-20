import java.io.*;
public class demo {

  public static void main(String[] args)throws Exception
  {
    DataInputStream d = new DataInputStream(System.in);
    
    System.out.print("Enter the decimalpoint value:");
    double s=Double.parseDouble(d.readLine());
    System.out.format("%.0f",s);
    
  }
}
