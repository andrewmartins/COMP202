//Name: A.Martins
//Student Number: 260719278
public class Classifier{
  public static void main(String[] args){
    if(args.length < 2) {
      System.out.println("You need to enter two arguments to this program. Try typing 'run Classifier 1 0 Grey' in Dr. Java on the command line.");
      return;
    } 
    /* the length of the beak (in mm) = b
     * the length of the claw (in mm) = c
     */
    int b = Integer.parseInt(args[0]);
    int c = Integer.parseInt(args[1]);
    String colour = args[2];
    /* calling each boolean method as if statements with all the 
     * possible combinations of types
     * there is no occurence where every type is seen in a bird =>
     * A B C is not evaluated as an if statement and  is skipped
     */ 
    if(isTypeA(b, c, colour) && isTypeB(b, c, colour)){
      System.out.println("The type of bird is A B");
    }
    else if(isTypeA(b, c, colour) && isTypeC(b, c, colour)){
      System.out.println("The type of bird is A C");
    }
    else if(isTypeB(b, c, colour) && isTypeC(b, c, colour)){
      System.out.println("The type of bird is B C");
    }
    else if(isTypeA(b, c, colour)){
      System.out.println("The type of bird is A");
    }
    else if(isTypeB(b, c, colour)){
      System.out.println("The type of bird is B");
    }
    else if(isTypeC(b, c, colour)){
      System.out.println("The type of bird is C");
    }
    else{
      System.out.println("The bird is not part of the study");
    }
  }
  // programming the combinations of all A types
  public static boolean isTypeA(int b, int c, String colour){
    if(colour.equalsIgnoreCase("Grey")){
      if(b == 1 && c == 0){
        return true;
      }
      else if(b == 2 && c == 1){
        return true;
      }
      else if(b == 3 && c == 2){
        return true;
      }
      else if(b == 4 && c == 3){
        return true;
      }
      else if((b == 4 || b == 5) && c == 4){
        return true;
      }
    }
    return false;
  }
  //programming the combinations of all B types
  public static boolean isTypeB(int b, int c, String colour){
    if(colour.equalsIgnoreCase("Blue")){
      if(b == 6 && (c == 8 || c == 9)){
        return true;
      }
      else if(b == 7 && c == 10){
        return true;
      }
      else if(b == 8 && c == 11){
        return true;
      }
    }
    if(b == 4 && (c == 4 || c == 5) && colour.equalsIgnoreCase("Grey")){
      return true;
    }
    else if(b == 5 && (c == 6 || c == 7) && colour.equalsIgnoreCase("Grey")|| colour.equalsIgnoreCase("Blue")){
      return true;
    }
    return false;
  }
  //programming the combination of all C types
  public static boolean isTypeC(int b, int c, String colour){
    if(colour.equalsIgnoreCase("Green")){
      if(b == 6 && (c == 8 || c == 9)){
        return true;
      }
      else if(b == 7 && c == 10){
        return true;
      }
      else if(b == 8 && c == 11){
        return true;
      }
      else if(b == 9 && c == 12){
        return true;
      }
    }
    if(b == 5 && (c == 6 || c == 7) && (colour.equalsIgnoreCase("Blue") || colour.equalsIgnoreCase("Green"))){
      return true;
    }
    return false;
  }
}