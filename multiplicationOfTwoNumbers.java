import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
       System.out.println("Enter the multiplicant: ");
        int mul=Integer.parseInt(d.readLine());
         System.out.print("Enter the multiplier: ");
        int m=Integer.parseInt(d.readLine());
        int s1=0;
        for(int i=0;i<m;i++)
        {
            s1=s1+mul;
        }
        System.out.print("The answer is : "+s1);
    }
}
