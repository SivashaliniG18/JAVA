import java.io.*;
import java.lang.*;
class demo{
    public static void main(String[] args) throws Exception 
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the Binary value : ");
        long bin=Long.parseLong(d.readLine());
        int oc=findOctal(bin);
        System.out.print("The Octal value is : "+oc);
    }
    public static int findOctal(long binary)
    {
        int octal=0;int i=0;
        while(binary!=0)
        {
         octal+=((binary%10)*Math.pow(8,i));
         binary/=10;
         i++;
        }
        return octal;
    }
}
