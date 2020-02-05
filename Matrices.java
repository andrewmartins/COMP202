import java.util.Arrays;
public class Matrices{
  public static void main(String[] args){
    int[][] x = {{5,6},{1,2},{8,0}};
    int[][] y ={{1,2,3},{5}};
    int[][] z = new int[3][15];
    //System.out.println(isMatrix(z));
    //System.out.println(isMatrix(y));
    System.out.println(getColumn(x,0));
  }
  // a method that takes a 2D array of ints as input
  // returns true if the array is a matrix, false otherwise
  public static boolean isMatrix(int[][] m){
    // check whether all subarrays have the same length
    int size = m[0].length;
    // iterate thorough subarrays
    for(int i=0; i<m.length;i++){
      //m[i] is a subarray
      if(m[i].length != size){
        return false;
      }
    }
    return true;
        
      
  }
  // method that takes a 2D aray of ints m as input
  // and an int i. the method return an array of int containing
  // the element of the i-th column of m.
  public static int[] getColumn(int[][] m, int i){
    // data validation
    if(!isMatrix(m)){
      throw new IllegalArgumentException("not a matrix");
    }
    // we can assume that every subarray has the same length
    int cols = m[0].length;
    // create an array to store the elements of the column i
    int[] column = new int[m.length];
    for(int j=0; j<column.length; j++){
      column[j] = m[j][i];
    }
    return column;
      
  }
    
}
  
  