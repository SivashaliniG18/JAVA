import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
   System.out.println("Enter  number");
     int n1=Integer.parseInt(d.readLine());
    System.out.println("Enter  number");
     int n2=Integer.parseInt(d.readLine());
     int d1=gcd(n1,n2);
     System.out.println("GCD of the number is:"+d1);
  }
     public static int gcd(int n1,int n2)
     {
         
         if(n2!=0)
        {
            return gcd(n2,n1%n2);
        }
           else
             return n1;
     }
 
  
}
