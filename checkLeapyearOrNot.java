import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the year : ");
        int year=Integer.parseInt(d.readLine());
        if((year%100==0)&&(year%400==0))
        {
            System.out.println("Leap year  ");
        }
        else if((year%100==0)&&(year%4==0))
        {
            System.out.println("Leap year");
        }
        else
         System.out.println("Not a year ");
    }
}
