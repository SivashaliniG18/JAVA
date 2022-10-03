import java.io.*;
class demo{
    public static void main(String[] args) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the value : ");
        long r=Long.parseLong(d.readLine());
        double peremeter=4*r;
        double area=r*r;
        System.out.print("Area of Square is:"+area);
        System.out.print("Premeter of Square is:"+premeter);
    }
}
