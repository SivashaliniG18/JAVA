import java.io.*;
class demo {
    public static void main(String[] args)throws Exception {
        DataInputStream d=new DataInputStream(System.in);
         System.out.print("Enter the input:");
        int n=Integer.parseInt(d.readLine());
        int sum=(n*(n+1))/2;
        System.out.print("Sum of namtural number upto "+n+" is "+sum);
    }
}
