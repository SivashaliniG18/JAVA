import java.io.*;
class demo{
    public static void main(String[] args) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the number");
        long no=Long.parseLong(d.readLine());
        System.out.print("The phone number is:"+no);
    }
}
