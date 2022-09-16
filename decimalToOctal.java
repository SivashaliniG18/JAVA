import java.io.*;
class demo{
    public static void main(String[] args) throws Exception 
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the Decimal value : ");
        int de=Integer.parseInt(d.readLine());
        int o=findOctal(de);
        System.out.print("The Octal value is : "+o);
    }
    public static int findOctal(int dec)
    {
        int octal=0,i=1;
        while(dec!=0)
        {
        octal=octal+(dec%8)*i;
        dec/=8;
        i*=10;
        }
        return octal;
    }
}
