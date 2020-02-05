//this is a program that converts Faranheit to Celsius
public class DegreesCalculator {
  public static void main(String[] args) {
    //declare a variable for the temperature in Fah
    //and initialize it with value 85
    
    int tempFah =285;
    
    //add a variable for the temperature in Celcius
    int tempCel = tempFah-32*5/9;
    System.out.print(tempFah + " Fahrenheit is equivalent to ");
    System.out.print(tempCel + " Celcius is equivalent to");
    System.out.println((tempFah-32)*(5.0/9.0) + " Celcius");
    
    //System.out.println(3+5+"Try this");
  }
}