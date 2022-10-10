import java.io.*;

class demo{
    public static void main(String[] args)throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        int []a=new int[20];
        System.out.println("Enter the number of element:");
        int n=Integer.parseInt(d.readLine());
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(d.readLine());
        }
        System.out.print("Enter the position to delete:");
        
          int pos=Integer.parseInt(d.readLine());
           System.out.println("Before the deletion:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
          }
         for(int i=pos;i<=n;i++)
        {
            a[i]=a[i+1];
        }
        n--;
        System.out.println("After the deletion:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
          }
    }
}
