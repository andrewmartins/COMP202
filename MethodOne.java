public class MethodOne{
  public static void main(String[] args){
    methodOne(12.0, 5.0);
  }
  public static boolean methodOne(double y, double z){
    double numberOne = y--;
    double numberTwo = z++;
    boolean greaterThan = True;
    boolean smallerThan = True;
    boolean divisibileByTwo = True;
    boolean goodnumber;
    if(number<100 && numberTwo<100){
      greaterThan=False;
    }
    else if(numberOne>50 || numberTwo>50){
      smallerThan = False;
    }
    else if (!(numberOne%2 == 0) && !(numberTwo%2 == 0)){
      divisibileByTwo = False;
    }
    else{
      goodNumber = True;
      return goodnumber;
    }
  }
}