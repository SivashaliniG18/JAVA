import java.io.*;
class demo{
    public static void main(String[] args)throws Exception
    {
        System.out.print("Enter the string:");
        DataInputStream d=new DataInputStream(System.in);
        String s=d.readLine();
       boolean num=true;
        try{
            double d1=Double.parseDouble(s);
        }
        catch(NumberFormatException e)
        {
            num=false;
        }
        if(num)
        {
             System.out.println("string is Numeric");
        }
        else
          System.out.println("The string is Nonnumeric");
    }
}
