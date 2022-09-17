import java.io.*;
public class Reverse {

  public static void main(String[] args)throws Exception
  {
    DataInputStream d = new DataInputStream(System.in); 
    System.out.print("Enter the size of array:");
    int s=Integer.parseInt(d.readLine());
    int[] arr=new int[s];
    System.out.print("Enter the  value:");
    for(int i=0;i<s;i++)
    {
    int n=Integer.parseInt(d.readLine());
    arr[i]=n;
    }
    int sum=0;
    for(int i=0;i<s;i++)
    {
         sum=sum+arr[i];
    }
    float avg=sum/s;
    System.out.print("Average of array is : "+avg);
  }
}
