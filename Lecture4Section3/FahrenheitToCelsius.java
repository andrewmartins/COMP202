// this is a program that converts 85F into Celsius
public class FahrenheitToCelsius {
    
    public static void main(String[] args) {
        // declare a variable for the temperature in Fah
        // and initialize it with value 85
        int tempFah = 35;
        
        // add a variable for the temperature in Celsius
        int tempCel = (tempFah-32)*5/9;
        
        System.out.print(tempFah + " Fahrenheit is equivalent to ");
        System.out.println(tempCel + " Celsius");
        
        //System.out.println(3+(5+"Try this"));
    }
}