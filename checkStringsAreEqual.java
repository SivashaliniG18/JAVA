import java.io.*;
class demo{
    public static void main(String[] args)throws Exception
    {
       
        DataInputStream d=new DataInputStream(System.in);
         System.out.print("Enter the string1:");
        String s=d.readLine();
         System.out.print("Enter the string2:");
        String s1=d.readLine();
       if(s.equals(s1))
            System.out.print("The two string is Equal");
        else
            System.out.print("The two string is Not Equal");
    }
}
