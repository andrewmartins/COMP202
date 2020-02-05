public class Exam{
  
  private String aCode;
  private int aNumber;
  private SinglyLinkedList aGrades = new SinglyLinkedList();
 
  
  public Exam(String pNumber){
    
    assert pNumber.matches("^[A-Z]{4}\\s\\d{3}$");
    String[] tokens = pNumber.split(" ");
    aCode = tokens[0];
    aNumber = Integer.parseInt(tokens[1]);
    
  }
  
  public static void main(String[] args){
    
    Exam exam = new Exam("COMP 250");
    System.out.println(exam.getCourseNumber());
    Exam 
    
  }
  
  public void add(int pGrade){
    
    aGrades.add(pGrade);
    
  }
  
  public int getNumberOfExams(){
    
    aGrades.length();
    
  }
  
  public double getAverage(){
    
    int sum = 0;
    for(int i = 0; i<aGrades.length(); i++){
      sum += aGrades.get(i);
    }
    return sum / (double) aGrades.length();
    
  }
  
  public String getCourseNumber(){
    
    return aCode + " " + aNumber;
    
  }
  
}