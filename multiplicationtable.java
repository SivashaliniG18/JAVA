import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
       DataInputStream d=new DataInputStream(System.in);
       System.out.println("Enter the table you want:");
       int t=Integer.parseInt(d.readLine());
       for(int i=1;i<=16;i++)
       {
           int a=i*t;
           System.out.println(i+" * "+t+" = "+a);
       }
       
    }
}
