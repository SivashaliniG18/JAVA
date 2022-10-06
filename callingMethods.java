class demo {
  public int add(int a, int b) {
      System.out.println("I am work first (add function)...");
    int sum = a + b;
    return sum;
  }
  public void square(int num) {
    int result = num * num;
    System.out.println(result);    
  }
  public static void main(String[] args) {
  demo o = new demo();
    o.square(o.add(15, 9));

  }
}
