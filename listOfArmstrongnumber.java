import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
       
       DataInputStream d=new DataInputStream(System.in);
       System.out.println("Enter the lowernumber:");
       int l=Integer.parseInt(d.readLine());
        System.out.println("Enter the highest numbers:");
       int h=Integer.parseInt(d.readLine());
       int s=0,copy,r;
       copy=l;
       while(l<=h)
       {
         l=copy;
         s=0;
         while(l>0)
         {
             r=l%10;
             s=s+(r*r*r);
             l=l/10;
         }
       if(copy==s)
       {
        System.out.println(s);
       }
       copy++;
     }
  }
}
