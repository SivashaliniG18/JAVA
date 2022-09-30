import java.io.*;
class demo {
  public static void main(String[] args)throws Exception
  {
     String s1 = "true";
    String s2 = "false";
    boolean b1 = Boolean.parseBoolean(s1);
    boolean b2 = Boolean.parseBoolean(s2);
    System.out.println(b1);    
    System.out.println(b2);    
  }
}
