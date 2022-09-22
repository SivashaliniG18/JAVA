import java.io.*;

class demo {
    public static void main(String[] args) throws Exception{
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the chioce: \napple\norange\nmango\nbanana\n");
        String s=d.readLine();
        switch(s)
        {
            case "apple": System.out.print("I am in apple block");
                           break;

             case "orange": System.out.print("I am in orange block");
                           break;
             case "mango": System.out.print("I am in mango block");
                           break;
             case "banana": System.out.print("I am in banana block");
                            break;
             default      :   System.out.print("I am in default block");
                               break;               

        }
    }
}
