import java.io.*;
class demo{
    public static void main(String ar[]) throws Exception
    {
        
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the number : ");
        int a=Integer.parseInt(d.readLine());
        if(a<0)
            System.out.print("Negative number");
        else
           System.out.print("positive Number");
        
    }
}
