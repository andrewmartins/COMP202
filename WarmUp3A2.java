public class WarmUp3A2{
  public static void main(String[] args){
    zEqual(3,4,5);
  }
  public static int zEqual(int x, int y, int z){
    if(z == 3 || z == x + y){
      System.out.print("z is equal to 3 or the sum of x + y");
    }
    else{
        System.out.println("z is not equal to 3 or the sum of x + y");
        return z;
                                                    
}
  }
}