import java.io.*;

class demo {
    public static void main(String[] args) throws Exception{
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the principal: ");
       double p = Double.parseDouble(d.readLine());

       System.out.print("Enter the rate: ");
        double r = Double.parseDouble(d.readLine());

    System.out.print("Enter the time: ");
    double n = Double.parseDouble(d.readLine());

    double interest = (p*n* r) / 100;

    System.out.println("Principal: " + p);
    System.out.println("Interest Rate: " + r);
    System.out.println("Time Duration: " + n);
    System.out.println("Simple Interest: " + interest);
               

        }
    }
