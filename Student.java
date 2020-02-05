import java.util.Arrays;
public class Student{
  
  // attributes
  
  private String name;
  private int studentID;
  private double[] grades;
  private String[] courses;
  
  //constructor
  public Student(){
    System.out.println("creating a new student..");
  }
  
  public Student(String n, int id){
    this.name = n;
    studentID = id;
  }
  public String[] getCourses(){
    // make a copy
    if(this.curses
  
  public Student(String name, int id, String[] c){
    // initialize the attributes of the student
    this.name = name;
    this.studentID = id;
    this.courses = new String[c.length];
    // creating a copy of the input array
    for(int i = 0; i<c.length; i++){
      this.courses[i] = c[i];
    }
  }
      
    
  
  public static void main(String[] args){
    
    String[] coursesForHarry = {"Potions","Charms","Arithmancy"};
    Student h = new Student("Harry", 12345, coursesForHarry);
    System.out.println(Arrays.toString(h.courses));
    coursesForHarry[0] = "COMP 202";
    System.out.println(Arrays.toString(h.courses));
    /*
     // create a student
     Student giulia = new Student("Giulia", 12345);
     // initialize the name of the student
     System.out.println(giulia.name);
     System.out.println(giulia.studentID);
     Student harry = new Student();
     harry.name = "Harry";
     System.out.println(harry.name);
     */
   
}
}