class demo {

  int sum;
  demo() {
       this(5, 2);
      System.out.print("I am in first constructor");
   
  }
  demo(int arg1, int arg2) {
    this.sum = arg1 + arg2;
     System.out.print("I am in second constructor");
  }
  void display() {
    System.out.println("finally Sum is: " + sum);
  }
  public static void main(String[] args) {
    demo obj = new demo();
    obj.display();
  }
}
