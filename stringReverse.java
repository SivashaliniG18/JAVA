import java.io.*;
public class Reverse {

  public static void main(String[] args)throws Exception
  {
    DataInputStream d = new DataInputStream(System.in); 
     System.out.print("Enter the String:");
    String s=d.readLine();
    reverse(s);
  }

  public static void reverse(String s) {
      char ch;String n=" ";
    for(int i=0;i<s.length();i++)
    {
        ch= s.charAt(i); 
        n= ch+n; 
    }
       System.out.print(n);
  }
}
