public class LoopPractice{
  public static void main(String[] args){
    int i =0;
    int j =12;
    int totalDaysFromMonths = 0;
    while(i<j){
      totalDaysFromMonths += getDaysInAMonth(getMonth(currentDate),getYear(currentDate));
      i++;
      
    }
    System.out.println(totalDaysFromMonths);
  }
}