import java.io.*;
public class demo{

  public static void main(String[] args)throws Exception
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the string with some white space: ");
    String s=d.readLine();
    s= s.replaceAll("\\s", "");
        System.out.println("After replacement: " + s);
  }
}
