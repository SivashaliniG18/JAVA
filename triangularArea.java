import java.io.*;
class demo{
    public static void main(String[] args)throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter length:");
        double l=Double.parseDouble(d.readLine());
        System.out.println("Enter height:");
        int b=Integer.parseInt(d.readLine());
        double area=0.5*(l*b);
        
        System.out.println("Area:"+area);
        
    }
}
