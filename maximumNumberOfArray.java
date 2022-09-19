import java.io.*
;public class Reverse {

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
    int temp=0,j;
    for(int i=0;i<s;i++)
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
   System.out.print("The maximum number of the array is: "+a[s-1]);
  }
}
