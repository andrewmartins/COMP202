public class SameSubArray{
  public static void main(String[] args){
    int[][] arr = {{1},{1,1,1,1},{2,2}};
    System.out.println(subArraySame(arr));
  }
  
  public static boolean subArraySame(int[][] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=1;j<arr[i].length;j++){
        if(arr[i].length>1){
          if(arr[i][j] != arr[i][j-1]){
          return false;
          }
        }
      }    
    }
    return true;
  }
}