import java.io.*;
public class demo {

  public static void main(String[] args)throws Exception
  {
      int i,j,k;
    DataInputStream d = new DataInputStream(System.in); 
    System.out.print("Enter the size of array:");
    int s=Integer.parseInt(d.readLine());
    int[] a=new int[s];
    System.out.println("Enter the  value:");
    for( i=0;i<s;i++)
    {
    int n=Integer.parseInt(d.readLine());
    a[i]=n;
    }
    for(i=0;i<s;i++)
    {
        for(j=i+1;j<s;j++)
        {
            if(a[i]==a[j])
            {
                for( k=j;k<s-1;k++)
                {
                    a[k]=a[k+1];
                }
                s--;
                j--;
            }
        }
    }
     System.out.print(" The array elements are: ");
    for( i=0;i<s;i++)
    {
        System.out.print("  "+a[i]+"  ");
    }
  }
}
