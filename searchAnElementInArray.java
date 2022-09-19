import java.io.*;
public class demo {

  public static void main(String[] args)throws Exception
  {
    DataInputStream d = new DataInputStream(System.in); 
    System.out.print("Enter the size of array:");
    int s=Integer.parseInt(d.readLine());
    int[] a=new int[s];
    System.out.print("Enter the  value:");
    for(int i=0;i<s;i++)
    {
    int n=Integer.parseInt(d.readLine());
    a[i]=n;
    }
     System.out.print(" Enter the search element: ");
     int search=Integer.parseInt(d.readLine());
     int k=0;
    for(int i=0;i<s;i++)
    {
        if(a[i]==search)
             k=k+1
    }
    if(k==1)
      System.out.print("The needed value is exist")
      else
        System.out.print("The value is Does not Exist")
  }
}
