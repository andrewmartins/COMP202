public class Lecture10 {
  public static void main(String[] args){
    myMethod(5, 9);
    myMethod(-4, -3);
    myMethod(4, 12);
    myMethod(-2, -5);
                    
    int x = 1;
    if(x){
      System.out.pritnln(x);
    }
      
  }
  // a method that takes two integer as unput x and y
  // and prints the product of the two if x is less than y, and y is odd
  // prints the sum otherwise
  /*
   * myMethod(5, 9) --> 45
   * myMethod(4, 12) --> 16
   * meMethod(5, 2) --> 7
   * myMethod(5, 3)--> 8
   * myMethod(5, 5) --> 10
   * myMethod(-4, -3) --> 12
   * myMethod(-2, -5) --> -7
   */
  public static void myMethod(int x, int y) {
    if(x<y && y%2 !=0) {
      System.out.println(x*y);}
    else{
      System.out.println(x+y);}
  }
}
