import java.io.*;
class demo {
    public static void main(String[] args)throws Exception {
        DataInputStream d=new DataInputStream(System.in);
         System.out.print("Enter the input:");
        int n=Integer.parseInt(d.readLine());
        int s=1;
        for(int i=1;i<=n;i++)
            s=s*i;
        System.out.print("Factorial of a given number is :"+s);
    }
}
