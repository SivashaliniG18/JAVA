import java.io.*;
public class Reverse {

  public static void main(String[] args)throws Exception
  {
    DataInputStream d = new DataInputStream(System.in); 
    System.out.print("Enter the Base value:");
    int a=Integer.parseInt(d.readLine());
    System.out.print("Enter the power value:");
    int n=Integer.parseInt(d.readLine());
    int p=power(a,n);
     System.out.print("Enter the power value:"+p);
  }

  public static int power(int a,int n) {
      
    if(n!=0)
    {
        int po=a*power(a,n-1);
         return po;
    }
    else
     return 1;
  }
}
