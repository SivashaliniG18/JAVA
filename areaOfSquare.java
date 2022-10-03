import java.io.*;
class demo{
    public static void main(String[] args) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the radius: ");
        long r=Long.parseLong(d.readLine());
        double peremeter=2*3.14*r;
        double area=3.14*r*r;
        System.out.print("Area of circle is:"+area);
        System.out.print("Premeter of circle is:"+premeter);
    }
}
