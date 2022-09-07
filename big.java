class demo{
    public static void main(String[] args) throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the a=");
        int a=Integer.parseInt(d.readLine());
         System.out.print("Enter the b=");
        int b=Integer.parseInt(d.readLine());
         System.out.print("Enter the c=");
        int c=Integer.parseInt(d.readLine());
        if((a>b)&&(a>c))
            System.out.print("a is big");
        else if((b>c)&&(b>a)) 
            System.out.print("b is big");
        else
            System.out.print("c is big");
           
        
    }
}
