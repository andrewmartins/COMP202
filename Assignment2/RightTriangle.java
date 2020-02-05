//Name:A. Martins
//Student Number: 260719278
public class RightTriangle{
  public static void main(String[] args){
    /* Determine if n is positive or negative; if greater than or equal to 0 => 
     * call the method
     * if negative => print error
     * the integer "n" is equal to the length of the base of the triangle
     */ 
    int n = Integer.parseInt(args[0]);
    if(n>=0){
      baseOfTriangle(n);
    }
    else
    {System.out.println("Error:input value must be >=0");
    }
  } 
  public static int baseOfTriangle(int n){
    for(int i = 1; i<n+1; i++){
      for(int a = i-1; a<n-1; a++){
        System.out.print(" ");
      }
      for(int j = 0; j<i; j++){
        System.out.print("*");
      }
      System.out.print("\n");  
    }
    return n;
  }
}