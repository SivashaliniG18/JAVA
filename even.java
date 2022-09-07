import java.io.*; 
class demo{
    public static void main(String[] args) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the number:");
        int a=Integer.parseInt(d.readLine());
        if(a%2==0)
             System.out.print("The number is even");
        else
           System.out.print("The number is odd");
           
        
    }
}
