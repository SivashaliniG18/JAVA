import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
       System.out.print("Enter your choice caps or small :");
       String n=d.readLine();
    char c;
    if(n=="caps")
    {
     for(c = 'A'; c <= 'Z'; ++c)
        System.out.print(c + " ");
    }
    else
    {
       for(c = 'a'; c <= 'z'; ++c)
        System.out.print(c + " "); 
    }
}
