//Fill in your name and student number
//Name: A. Martins
//Student Number: 260719278

public class InputAnalyzer {
    public static void main(String args[]) {
        if(args.length < 3) {
            System.out.println("You need to enter three arguments to this program. Try typing 'run InputAnalyzer 2.5 8 9' in Dr. Java, or 'java InputAnalyzer 2.5 8 9' on the command line.");
            return;
        } 
        double a = getInputDouble(args[0]);
        double b = getInputDouble(args[1]);
        double c = getInputDouble(args[2]);
        
        //========================
        //Enter your code below
        
        // 1) Determining if a, b, and c are all non negative numbers
        boolean allPosNumbs = 0 <= a && 0 <= b && 0 <=c;       
        System.out.println("The numbers " + a + ", " + b + ", " + c + " are all non-negative numbers: " + allPosNumbs);
        
        // 2) Determine if at least one of a, b or c is an odd number  

        boolean oneOddNumb  = ((a - (int)a) ==0) && (a%2 != 0) ||  ((b - (int)b) ==0) && (b%2 != 0) || ((c - (int)c) ==0) && (c%2 != 0);

        System.out.println("At least one of " + a + ", " + b + ", or " + c + " is odd: " + oneOddNumb);
 
        // 3) Determine if a, b, and c were entrered in decreasing order
        
        boolean bInBetween= a>b && b>c;
        
        System.out.println("The numbers " + a + ", " + b + ", " + " and " + c + " are in strictly decreasing order: " + bInBetween);
        
        /** 4) Determine if a, b, and c are all non negative numbers or are entered
          * in decreasing order
          */
        
        boolean condition1and3 = allPosNumbs || bInBetween;
        
        System.out.println("The numbers " + a + ", " + b + ", " + c + " are all non-negative numbers or are in strictly decreasing order: " + condition1and3);
        
        // 5) Determine if a, b and c are all non-negative and none of them are odd
        
        boolean noOddNumbs  = (((a - (int)a) !=0) || a%2==0) && (((b - (int)b) !=0) || b%2==0) && (((c - (int)c) !=0) || c%2==0);
        
        boolean posAndEvenNumbs = noOddNumbs && allPosNumbs;
        
        System.out.println("The numbers " + a + ", " + b + ", " + c + " are all non-negative numbers and none of them are odd: " + posAndEvenNumbs);
          
        
        
        
        
        
        //Enter your code above
        //========================
    }
    
    public static double getInputDouble(String arg)
    {
        try
        {
            return Double.parseDouble(arg);
        } catch(NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage() + " This argument must be a number!");
        }
        
        //error, return 0
        return 0;
    
    }
}
