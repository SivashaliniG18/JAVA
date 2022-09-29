import java.io.*;
public class Main {

  public static void main(String[] args)throws Exception
  {
     System.out.print("Enter the number of rows :");
    DataInputStream d=new DataInputStream(System.in);
    int rows=Integer.parseInt(d.readLine());
    int k=0;
    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}
