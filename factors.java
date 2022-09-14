import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter the number :");
       int n=Integer.parseInt(d.readLine());
       System.out.println("The factors are : ");
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
              System.out.println(i+"");
       }
  }
}
