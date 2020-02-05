public class VaariableConverter {
  public static void main(String[] args) {
    int x=3;
    int y=7;
    System.out.println("x="+ x);
    System.out.println("y=" + y);
   int temp=x;
   x=y;
   int temp=y;
   System.out.println("x=" + x);
   System.out.println("y=" + y);
  }
}