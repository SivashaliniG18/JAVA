import java.io.*;
public class demo{
  public static void main(String[] args)throws Exception {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the a=");
    int n1=Integer.parseInt(d.readLine());
    System.out.print("Enter the b=");
    int n2=Integer.parseInt(d.readLine());
    int l;
    l = (n1 > n2) ? n1 : n2;
    while(true) {
       if( l% n1 == 0 && l % n2 == 0 ) {
         System.out.printf("The LCM of %d and %d is %d.", n1, n2, l);
         break;
      }
      ++l;
    }
  }
}
