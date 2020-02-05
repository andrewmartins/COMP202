public class TestConstructor{
  public static void main(String[] args){
    int[] a ={6,7,8,9,10};
    method((double[])a);
    System.out.println(a);
  }
  public static void method(double[] b){
    for(int i=0;i<b.length;i++){
      b[i]=i;
    }
  }
}
  