import java.io.*;
import java.util.*;
public class JoinLists {
    public static void main(String[] args) {
        int i,n;
       Scanner st=new Scanner(System.in);
       System.out.print("Enter the limit : ");
       n=st.nextInt();
        List<Integer> list1 = new ArrayList<Integer>();
        for(i=0;i<n;i++)
              list1.add(i);

         List<Integer> list2 = new ArrayList<Integer>();
         for(i=0;i<n;i++)
              list2.add(i);
         List<Integer> joined = new ArrayList<Integer>();

        joined.addAll(list1);
        joined.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);

    }
}
