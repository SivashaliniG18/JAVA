import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
    System.out.println("Enter  number");
     int n2=Integer.parseInt(d.readLine());
     int d1=sum(n2);
     System.out.println("Sum of the number is:"+d1);
  }
     public static int sum(int num)
     {
         int t=0;
         if(num!=0)
            return num+sum(num-1);
         else
           return t;
     }
  
   
  
}
