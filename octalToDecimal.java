import java.io.*;
import java.lang.*;
class demo{
    public static void main(String[] args) throws Exception 
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the Decimal value : ");
        int oc=Integer.parseInt(d.readLine());
        int de=findDecimal(oc);
        System.out.print("The Octal value is : "+de);
    }
    public static int findDecimal(int octal)
    {
        int decimal=0;int i=0;
        while(octal!=0)
        {
         decimal+=((octal%10)*Math.pow(8,i));
         octal/=10;
         i++;
        }
        return decimal;
    }
}
