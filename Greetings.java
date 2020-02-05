public class Greetings{
  //atributes
  public static String politeGreet;
  
  
  public static void main(String[] args){
    Greetings g = new Greetings();
    g.hello("Giulia");
    //Greetings.politeGreet = "Good afternoon";
    System.out.println(Greetings.politeGreet);
  }
  
  public static void hello(String name){
    
    System.out.println("Hello " + name + "!");
  }
  
}