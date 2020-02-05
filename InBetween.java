/* A program that takes three integers x,y, and z as inputs 
 * and prints out true if y is a number between x and z
 * false otherswise
 */
public class InBetween {
  public static void main(String[] args){
    // 1) retrieve 3 ints as input
    int x = Integer.parseInt (args[0]);
    int y = Integer.parseInt (args[1]);
    int z = Integer.parseInt (args[2]);
    // 2) chekc whether y is in between x and z
    boolean inBetween = x<y && y<z;
    // 3 Display the info 
    System.out.println(y + " is a number in between " + x + " and " + z + ": " + inBetween);
  }
}