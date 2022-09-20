import java.io.*;
public class demo {

  public static void main(String[] args)throws Exception
  {
    DataInputStream d = new DataInputStream(System.in);
    int i,j,f;
    System.out.print("Enter the size of array1:");
    int s=Integer.parseInt(d.readLine());
    int[] a=new int[s];
    
    System.out.print("Enter the  value:");
    for( i=0;i<s;i++)
    {
    int n=Integer.parseInt(d.readLine());
    a[i]=n;
    }
    System.out.print("Enter the size of array2:");
    int s2=Integer.parseInt(d.readLine());
    int[] b=new int[s2];
    f=s+s2;
    int[] c=new int[f];
    System.out.print("Enter the  value:");
    for(i=0;i<s2;i++)
    {
    int n1=Integer.parseInt(d.readLine());
    b[i]=n1;
    }
    for(i=0;i<s;i++)
    {
        c[i]=a[i];
    }
    
    for(i=0,j=s;i<s2;i++,j++)
    {
        c[j]=b[i];
    }
     System.out.print(" The combained array elements are: ");
    for( i=0;i<f;i++)
    {
        System.out.print("  "+c[i]+"  ");
    }
  }
}
