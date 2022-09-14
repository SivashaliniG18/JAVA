import java.io.*;
class demo {
  public static void main(String[] args)throws Exception {
   DataInputStream d=new DataInputStream(System.in);
     String operator;
    int c;
    System.out.println("Choose an operator: +, -, *, or /");
    operator=d.readLine();
    System.out.println("Enter first number");
    int n1=Integer.parseInt(d.readLine());
    System.out.println("Enter second number");
     int n2=Integer.parseInt(d.readLine());
    switch (operator) {
        case "+":
        c = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " +c);
        break;
      case "-":
        c = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + c);
        break;
      case "*":
        c = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + c);
        break;
      case "/":
        c = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " +c);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }

   
  }
}
