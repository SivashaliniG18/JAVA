import java.io.*;
class d
{
public static void main(String a[])throws Exception
{
  System.out.print("Enter the value :");
  DataInputStream in= new DataInputStream(System.in);
  int val=Integer.parseInt(in.readLine());
  System.out.print("The integer value is:"+val);

}
}
