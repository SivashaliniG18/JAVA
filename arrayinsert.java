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
        System.out.print("Enter the position to insert:");
         int pos=Integer.parseInt(d.readLine());
         System.out.print("Enter the value to insert:");
          int val=Integer.parseInt(d.readLine());
           System.out.println("Before the insertion:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
          }
         for(int i=n;i>=pos;i--)
        {
            a[i+1]=a[i];
        }
        n++;
        a[pos]=val; 
        System.out.println("After the insertion:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
          }
    }
}
