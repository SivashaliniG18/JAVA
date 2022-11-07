import java.io.*;
import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
       int i,j,k;    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
     System.out.println("Enter Symbol : ");
     for(k=0;k<n;k++)
     {
	for(i=0;i<n-k;i++)
	{
	    System.out.print(" ");
	}
	for(j=0;j<n;j++)
	{
	     System.out.print("*");
	    
	}
	 System.out.print("\n");
	 i--;
     }      
    }
}
