public class ArraysTwo{
  public static void main(String[] args){
    int[] x = {1,2,3};
    method(x);
    
  }
  public static void method(int[] a){
    for(int i = 0; i<a.length; i++){
      System.out.println(a[i+1] - a[i]);
    }
  }
}
                      
                      