/** 
 * A program that takes an int as input and display whether or not
 * this input is even
 */
public class IsEven {
  public static void main(String[] args) {
    // 1) Retrieve and int as Input
    int n= Integer.parseInt (args[0]);
    // 2) Check whether the input is an even number
    boolean isEven = (n%2==0);
    // assignmnet operator has lower priority than equality
    // 3) Display the info
    // System,out.println(n + " is an even number: " + isEven);
    if (isEven) {
      System.out.println(n + " is an even number");}
    else {
      System.out.println(n + " is an odd number");} 
    
  }
}
