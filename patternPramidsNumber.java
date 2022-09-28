import java.io.*;
public class demo {

  public static void main(String[] args)throws Exception 
  {
      DataInputStream d=new DataInputStream(System.in);
      System.out.println("Enter the number of rows: ");
    int rows = Integer.parseInt(d.readLine());
   for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j+" ");
      }
      System.out.println("\n");
    }
  }
}
