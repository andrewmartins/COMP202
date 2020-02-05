//Fill in your name and student number
//Name: A.Martins
//Student Number: 260719278

// do NOT touch these import statements 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class CountdownDays {
  
  // the method returns a String representing the current date in the following format: dd/mm/yyyy
  // you can use it, but do NOT modify it!
  public static String getCurrentDate() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    LocalDateTime now = LocalDateTime.now();  
    return dtf.format(now);
  }
  
  //========================
  // Enter your code below
  
  // h) Setting up the main method. the displayCountdown method is called and the due date input argument provided by the user is used in this method. 
  
  public static void main(String[] args) {
    String dueDate = args[0];
    displayCountdown(dueDate);
  }
  
  // g) the countDaysLeft method is called and the dueDate input argument provided by the user is used in this method to process all calculations 
  // for days left. The getCurrentDate() method is also used as the current date argument. The result is printed from this method. 
  public static void displayCountdown(String dueDate){
    
    System.out.println("Today's Date: " + getCurrentDate());
    System.out.println("Due Date: " + dueDate);
    if(countDaysLeft(getCurrentDate(),dueDate) == 0){
      System.out.println("The due date has passed! :( Better luck next time!");
    }
    else{
      System.out.println("You have " + countDaysLeft(getCurrentDate(),dueDate) + " days left. You can do it!");
    }
  }
  //==================
  // the following methods are all called in method countDaysLeft() and will be discussed first, so as to not confuse the reader
  //==================
  // a) this method takes a string input and builds a new string, between and including the characters at position i and j. This method is used to isolate
  // the numbers of the day, the month and the year of the due date in the next method. 
  public static String getSubstring(String s, int i, int j){
    if(i>j){
      throw new IllegalArgumentException("The second integer cannot be smaller than the first integer");
    }
    else{
      String subString = "";
      for(int n = i; n<=j; n++){
        subString += s.charAt(n);
      }
      return subString; 
    }
  }
  // b) the following methods determines the day, month or year, of which the date of the input argument is at, using the subString() method.
  public static int getDay(String dueDate){
    if(dueDate.charAt(0) == 0){
      return Integer.parseInt(getSubstring(dueDate, 1, 1));
    }
    else{
      return Integer.parseInt(getSubstring(dueDate, 0, 1));
    }
  }
  public static int getMonth(String dueDate){
    if(dueDate.charAt(3) == 0){
      return Integer.parseInt(getSubstring(dueDate, 4, 4));
    }
    else{
      return Integer.parseInt(getSubstring(dueDate, 3, 4));
    }
  }
  public static int getYear(String dueDate){
    return Integer.parseInt(getSubstring(dueDate, 6, 9));
  }
  // c) this method is used throughout the program in tandem with the getYear() method (that will be the input in this method) as it will be necessary
  // to determine if the year of the current and/or due date are leap years and any years in between the two dates. 
  public static boolean isLeapYear(int year){
    if(year%100==0){
      if(year%400==0){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      if(year%4==0){
        return true;
      }
      else{
        return false;
      }
    }
  }
  // d) the following method determines the number of days in a month, which is used in tandem with the getMonth() and getYear() methods as inputs. 
  // This is essential to determine the number of days between the due date and current date. 
  public static int getDaysInAMonth(int month, int year){
    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
      return 31;
    }
    else if(month == 4 || month == 6 || month == 9 || month == 11){
      return 30;
    }
    else if(isLeapYear(year) && (month == 2)){
      return 29;
    }
    else{
      return 28;
    }
  }
  // e) this method uses the current and due date arguments, returns a true statement if the due date has passed and a false statement if the due date
  // has not passed. This method will be used to determine if any calculation is necessary for the remaining days. 
  public static boolean dueDateHasPassed(String currentDate, String dueDate){
    if(getYear(currentDate)>getYear(dueDate)){
      return true;
    }
    else if(getYear(currentDate) == getYear(dueDate)){
      if(getMonth(currentDate)>getMonth(dueDate)){
        return true;
      }
      else if(getMonth(currentDate) == getMonth(dueDate)){
        if(getDay(currentDate)>getDay(dueDate)){
          return true;
        }
      }
    }
    return false;
  }
  // f) in this method the remaining days from the current date to the due date is calucalted. It is separated into 4 parts. 
  public static int countDaysLeft(String currentDate, String dueDate){
    // Part 1. In the case where the current date has passed the due date, the dueDateHasPassed method is called with the currentDate and dueDate arguments 
    // as inputs. 
    if(dueDateHasPassed(currentDate, dueDate)){
      return 0;
    }
    // Part 2. In the case where the current date and the due date share the same month and year, the remaining days is calculated.
    else if((getMonth(currentDate) == getMonth(dueDate)) && (getYear(currentDate) == getYear(dueDate))){
      int numofDays = getDay(dueDate) - getDay(currentDate);
      return numofDays;
    }
    // Part 3. In the case where the current date and the due date share only the same year, the remaining days is calculated. 
    else if(getYear(currentDate) == getYear(dueDate)){
      int i = getMonth(currentDate);
      int j = getMonth(dueDate);
      int totalDaysFromMonths = 0;
      while(i<j){
        totalDaysFromMonths += getDaysInAMonth(i,getYear(currentDate));
        i++;
      }
      int totalDaysOfSameYear = totalDaysFromMonths - getDay(currentDate) + getDay(dueDate);
      return totalDaysOfSameYear;
    }
    // Part 4. All other cases will result in the due date being in the futre of a different year, that of the current date. The remaining days will be 
    // calculated. 
    else{
      int b = getYear(dueDate);
      int a = getYear(currentDate);
      int totalDaysFromYears = 0;
      while(a<b){
        if(isLeapYear(a)){
          totalDaysFromYears += 366;
        }
        else{ 
          totalDaysFromYears += 365;
        }
        a++;
      }
      int i = 1;
      int totalDaysFromMonthsOfcurrentDateYear = 0;
      while(i<getMonth(currentDate)){
        totalDaysFromMonthsOfcurrentDateYear += getDaysInAMonth(i, getYear(currentDate));
        i++;
      }
      int j = 1;
      int totalDaysFromMonthsOfdueDateYear = 0;
      while(j<getMonth(dueDate)){
        totalDaysFromMonthsOfdueDateYear +=getDaysInAMonth(j, getYear(dueDate));
        j++;
      }
      int totalDays = totalDaysFromYears - totalDaysFromMonthsOfcurrentDateYear - getDay(currentDate) + totalDaysFromMonthsOfdueDateYear + getDay(dueDate);
      return totalDays;
    }
  }
  
  
} 