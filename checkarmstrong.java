import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
      
       DataInputStream d=new DataInputStream(System.in);
       System.out.println("Enter the number:");
       int n=Integer.parseInt(d.readLine());
        int copy=n;
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            s=s+r*r*r;
            n=n/10;
        }
       if(copy==s)
       {
        System.out.println("the number is armstrong number");
      }
      else
        System.out.println("the number is Not armstrong number");
        
  }
}
