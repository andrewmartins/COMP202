public class CoinMachine {
    
    public static void main(String args[]) {
        if(args.length < 2) {
            System.out.println("You need to enter two arguments to this program. Try typing 'run CoinMachine 400 215' in Dr. Java, or 'java VendingMachine 400 215' on the command line.");
            return;
        } 
        int cash = getInputInteger(args[0]);
        int price = getInputInteger(args[1]);
        
        //========================
        //Enter your code below
        
        // Determine the change required
        int change = cash - price;
        
        //Change in toonies
        int numbOfToonies = change/200;
       
       
        //Change in loonies
        int changeinL = change - numbOfToonies*200;
        int numbOfLoonies = changeinL/100;
        
        //Change in quarters
        int changeinQ = changeinL - numbOfLoonies*100;
        int numbOfQuart = changeinQ/25;
        
        //Change in dimes
        int changeinD = changeinQ - numbOfQuart*25;
        int numbOfDimes = changeinD/10;
        
        //Change in nickels
        int changeinN = changeinD - numbOfDimes*10;
        int numbOfNick = changeinN/5;
        
        // Print Statements
        
        System.out.print("Amount received: " + cash + "\n");
        System.out.print("Cost of the item: " + price + "\n");
        System.out.print("Required change: " + change + "\n");
        System.out.print("Change: \n");
        System.out.print("twoonies x  " + numbOfToonies + "\n");
        System.out.print("loonies x   " + numbOfLoonies + "\n");
        System.out.print("quarters x  " + numbOfQuart + "\n");
        System.out.print("dimes x  " + numbOfDimes + "\n");
        System.out.println("nickels x  " + numbOfNick);
  

        //Enter your code above
        //========================
    }
    
    public static int getInputInteger(String arg) {
        try
          
        {
            return Integer.parseInt(arg);
        } catch(NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage() + " This argument must be an integer!");
        }
        
        //error, return 0
        return 0;
    }
}