import java.io.*;
import java.lang.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
   System.out.println("Enter Binary number: ");
     long n1=Long.parseLong(d.readLine());
   
     int d1=decimal(n1);
     System.out.println("Decimal value of is:"+d1);
  }
     public static int decimal(long n1)
     {
         int i=0,de=0;
         long re=0;
         
         while(n1!=0)
        {
            re=n1%10;
            n1=n1/10;
            de+=re*Math.pow(2,i);
            i++;
        }
             return de;
     }
}
