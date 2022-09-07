import java.io.*;
import java.util.*;
class demo{
    public static void main(String a[]) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the character : ");
        String s=d.readLine();
        char ch=s.charAt(0);
        int con=ch;
         System.out.print("The Ascii value of '"+ch+"' is :"+con);
    }
}
