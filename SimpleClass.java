public class SimpleCalc {
  
  public static void main(String[] args) {
    // 1) retrieve 3 input (int String int)
    
    int x = Integer. parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    String op = args[1];
      
    
    // 2) check whether or not the operation is supported 
    
    System.out.println(x + " " + op + " " + y);
    
    //4) Display the result
    
  }
}