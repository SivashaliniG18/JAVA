import java.io.*;
class demo {
    public static void main(String[] args)throws Exception {
        DataInputStream d=new DataInputStream(System.in);
         System.out.print("Enter the input:");
        String a=d.readLine();
        int ch=a.charAt(0);
        if(((97<=ch) &&(ch<=122))||((65<=ch)&&(ch<=90)))
             System.out.print(a+" is a alphabet");
        else
             System.out.print(a+" not a alphabet");
    }
}
