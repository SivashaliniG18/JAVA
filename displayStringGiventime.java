import java.io.*;
class demo {
    public static void main(String[] args)throws Exception 
    {  
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the string:");
        String s=d.readLine();
        System.out.println("Enter the number of times:");
        int p=Integer.parseInt(d.readLine());
        int i=0;
        for(i=1;i<=p;i++)
        {
          System.out.println(i+"."+s);  
        }
        
         
        
    }
}
