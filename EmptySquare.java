public class EmptySquare{
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    drawEmptySquare(n);
  }
  
// a method that takes one integer as input and draws an empty square witha  give size
/* 
 * drawEmptySquare(4)
 * ++++
 * +  +
 * +  +
 * ++++
 */
  public static void drawEmptySquare(int n){
    // a loop that iterates through the lines
    for(int i=0; i<n; i++){
      //display lines: need loops that iterate through the number of characters that we want displayed (n)
      //the first and the last should be full lines
      // all the lines in between should be empty lines
      if(i==0 || i==n-1) {
        //print full line
        for(int j = 0; j<n; j++){
          System.out.print("+");
        }
      }
      else{
        //print empty line
        for(int j=0; j<n; j++){
          if(j==0 || j==n-1){
            System.out.print("+");
          }
          else{
            System.out.print(" ");
          }
        }
      }
    System.out.println();
    }
  }
}

 