public class S{
  private int x = 0;
  public S(){
    x++;
  }
  public static void main(String args[]){
    S s = new S();
    System.out.println(s.x);
  }
}