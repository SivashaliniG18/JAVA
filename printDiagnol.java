import java.io.*;  
public class PrintMatrixDiagonal  
{  
public static void main(String args[])  
{  
int i, j, k, n=3, m=3;  
int arr[][] = {{3, 7, 9}, {2, 1, 5}, {8, 6, 4}};    
System.out.println("Matrix elements in diagonal form are: ");  
for(k=0; k<=m-1; k++)  
{  
i=k;  
j=0;  
while(i>=0)  
{  
System.out.print(arr[i][j]+"\t");  
i=i-1;  
j=j+1;  
}  
}  
for(k=1; k<=n-1; k++)  
{  
i=m-1;  
j=k;  
while(j<=n-1)  
{  
System.out.print(arr[i][j]+"\t");  
i=i-1;  
j=j+1;  
}  
}  
}  
}  
