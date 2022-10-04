import java.io.*;
class demo{
    public static void main(String[] args)throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter length:");
        int l=Integer.parseInt(d.readLine());
        System.out.println("Enter height:");
        int b=Integer.parseInt(d.readLine());
        int area=l*b;
        int peremeter=2*(l+b);
        System.out.println("Area:"+area);
        System.out.println("Peremeter:"+peremeter);
    }
}
