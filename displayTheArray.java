import java.io.*;
public class demo {

  public static void main(String[] args)throws Exception
  {
    DataInputStream d = new DataInputStream(System.in); 
    System.out.print("Enter the size of array:");
    int s=Integer.parseInt(d.readLine());
    int[] a=new int[s];
    System.out.print("Enter the  value:");
    for(int i=0;i<s;i++)
    {
    int n=Integer.parseInt(d.readLine());
    a[i]=n;
    }
     System.out.print(" The array elements are: ");
    for(int i=0;i<s;i++)
    {
        System.out.print("  "+a[i]+"  ");
    }
  }
}
