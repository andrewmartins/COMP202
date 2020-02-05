import java.util.ArrayList;
public class ArrayListPractice {
  
  
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("banana");
    fruits.add("apple");
    fruits.add("berries");
    System.out.println(beginsWith(fruits, 'b')); //toString method in ArrayList class
  }
  //a method that takes an ArrayList of Strings and a char c as input
  //it returns an ArrayList containing all the Strings that brgin with c
  /*
   * ("banana", "apple", "berries"), 'b'
   * --> ("banana", "berries")
   */
  public static ArrayList<String> beginsWith(ArrayList<String> list, char c) {
    ArrayList<String> toReturn = new ArrayList<String>();
   // find the element that begins with c
    for(int i=0; i < list.size(); i++) {
      String element = list.get(i);
      if (element.charAt(0)==c) {
        toReturn.add(element); 
      }
    }
    return toReturn;
  }
  
  
}
                          