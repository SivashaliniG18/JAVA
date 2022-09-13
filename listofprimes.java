  import java.io.*;
class demo {
    public static void main(String[] args)throws Exception
    {
       int gcd = 1;
       DataInputStream d=new DataInputStream(System.in);
       System.out.println("Enter the lowernumber:");
       int l=Integer.parseInt(d.readLine());
        System.out.println("Enter the highestnumbers:");
       int h=Integer.parseInt(d.readLine());
       while(l<h)
       {
           int p=0;
       for (int i = 2; i<=l/2; i++) 
       {
            if (l%i==0)
            {
                p=1;
                break;
            }
       }
       if((p==0)&&(l!=0))
       {
        System.out.println(" " + l);
      }
       l++;
     }
  }
}
