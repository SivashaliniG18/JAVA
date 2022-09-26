import java.io.*;
public class Reverse {

  public static void main(String[] args)throws Exception
  {
      int mid,j,i;
    DataInputStream d = new DataInputStream(System.in); 
    System.out.print("Enter the size of array:");
    int s=Integer.parseInt(d.readLine());
    int[] a=new int[s];
    System.out.print("Enter the  value:");
    for( i=0;i<s;i++)
    {
    int n=Integer.parseInt(d.readLine());
    a[i]=n;
    }
    int temp=0;
    for(i=0;i<s;i++)
    {
         for(j=i+1;j<s;j++)
         {
            if(a[i]>a[j])
            {
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                
            }
         }
    }
    for(i=0;i<s;i++)
    {
        System.out.print(a[i]+" ");
    }
    if(s%2==0)
         mid=(a[s/2]+a[s/2+1])/2;
    else
       mid=a[s/2];
       
   System.out.print("The meadian of the array is: "+mid);
  }
}
