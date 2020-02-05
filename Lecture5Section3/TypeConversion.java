/**
 * A program to practice how to convert from one type to another
 */
public class TypeConversion {
    
    public static void main(String[] args) { 
        String s = "3";
        double x;
        int y;
        
        // copy the value from s to x
        x = Double.parseDouble(s);
        
        // copy the value from x to y
        y = (int) x;
        
        System.out.println(s + " " + x + " " + y);
    }
    
    
}
