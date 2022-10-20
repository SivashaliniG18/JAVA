import java.io.*;
import java.util.*;
class demo{
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int i;
        for(i=st.length();i>0;i--)
        {
            System.out.print(st.charAt(i-1));
        }
    }
}
