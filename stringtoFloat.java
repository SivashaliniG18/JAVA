import java.io.*;
class demo{
    public static void main(String[] args) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter : ");
        float a=Float.parseFloat(d.readLine());
        System.out.print("The float values:"+a);
    }
}
