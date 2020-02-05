public class LongestSubArray{
  public static void main(String[] args){
    int[][] arr = {{1,2},{4,5},{0,5},{19,12,3}};
    System.out.println(longestSubArray(arr));
    
  }
  public static int longestSubArray(int[][] arr){
    int longestSubArr = 0;
    for(int i=0;i<arr.length;i++){
      if(i==0){
        if(arr[0].length>=arr[1].length){
          longestSubArr = arr[0].length;
        }
      }
      if(i>=1){
        if(arr[i-1].length<arr[i].length){
        longestSubArr = arr[i].length;
        }
      }
    }
    return longestSubArr;
  }
}
      