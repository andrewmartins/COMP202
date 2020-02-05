import java.util.Arrays;
public class Swapper{
  public static void main(String[] args){
    int[] x={1,2,3};
    int[] y={4,5,6,7,8};
    int[] temp = x;
    x=y;
    y=temp;
      
    swap(x,y);
    System.out.println(Arrays.toString(x) + " " + Arrays.toString(y));
    System.out.println(x.length + " " + y.length);
    swap(x[0],y[0]);
    System.out.println(x[0] + " " + y[0]);
  }
  public static void swap(int[] x, int[] y){
    int[] temp = x;
    x=y;
    y=temp;
    System.out.print(Arrays.toString(x));
    System.out.println(Arrays.toString(y));
      
    
  }
  public static void swap(int x, int y){
    int temp = x;
    x=y;
    y=temp;
  }
}
                                        
  
                           
         