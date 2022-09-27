import java.io.*;
class demo
{
    public static void main(String args[])throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the time:");
        int time=Integer.parseInt(d.readLine());
        System.out.print("Enter the rate:");
        double rate=Double.parseDouble(d.readLine());
        System.out.print("Enter the principle:");
         double principle=Double.parseDouble(d.readLine());
        double CI = principle *(Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
    }
}
