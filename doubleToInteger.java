import java.io.*;
class demo
{
    public static void main(String args[])throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the duble value:");
         double val=Double.parseDouble(d.readLine());
        int value = (int)val;
 
        System.out.println("Compound Interest is "+ value);
    }
}
