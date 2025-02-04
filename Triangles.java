/**
 *A program that computes the hypoteneuse
 * give the base and the height of such triangle
 */

public class Triangles {
  public static void main (String[] args){
    //declare and initialize variables for base and height
    
    double base = 4.5;
    double height = 11.0;
    
    // declare a variable to store the value of the hypoteneuse 
    
    double hyp;
    // use Math.sqrt() and Math.poq() to compute the value of hyp
    // use some auxiliary variables
    
    double baseSquared = Math.pow(base, 2.0);
    double heightSquared = Math.pow(height, 2.0);
    hyp= Math.sqrt(baseSquared+heightSquared);
    
    System.out.print("The triangle with base " + base);
    System.out.print(" and height " + height);
    System.out.println(" has a hypoteneuse equal to " + hyp);
  }
}