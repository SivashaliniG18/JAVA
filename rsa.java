mport java.io.*;
class diffieHellman{
private static long power(long a, long b, long p) 
{
    if (b == 1)
        return a;
   else

        return (((long)Math.pow(a, b)) % p);
}
public static void main(String[] args)throws Exception
{
 DataInputStream d=new DataInputStream(System.in);
    long q, r, x, xa, y, xb, ka, kb;
   System.out.print("Enter the prime: ");
    q=Long.parseLong(d.readLine());
    System.out.print("Enter the primitive root: ");
    r=Long.parseLong(d.readLine());
    System.out.println("The private key a for A:" );
    xa =Long.parseLong(d.readLine());
     System.out.println("The private key b for B:");
    xb=Long.parseLong(d.readLine());
    x = power(r, xa, q);
    y=power(r,xb,q);
    ka = power(y, xa, q); 
    kb = power(x, xb, q); 
    System.out.println("Secret key for the A is:" + ka);
    System.out.println("Secret key for the B is:" + kb);
}
}
