import java.util.Arrays;
public class LargestAverage{
  public static void main(String[] args){
    double[][] arr = {{1.5,2.3,5.7},{12.5,-50,25}};
    System.out.println(Arrays.toString(largestAverage(arr)));
    
  }
  public static double[] largestAverage(double[][] arr){
    double largestAve = 0;
    int sumOfArrayI = 0;
    double[] largestArr = {0,0};
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        sumOfArrayI += arr[i][j];
      }
      int aveOfArrayI = sumOfArrayI/arr[i].length;
      if(aveOfArrayI>largestAve){
        largestAve = aveOfArrayI;
        largestArr = arr[i];
      }
    }
    return largestArr;
  }
}       
        
                                  
    