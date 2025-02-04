public class Book{
  // attributes
  private String title;
  private String author;
  private double price;
  
  // constructors
  
  public Book(String title, double price){
    // initialize the attributes
    
    this.title = title;
    this.price = price;
    this.author = "Anonymous";
  }  
  public Book(String title, String authour, double price){
    // initialize the attributes
    
    this.title = title;
    this.price = price;
    this.author = author;
  }
  // other methods
  // a method print that displays the title, the author, and the price of a book
  public void print(){
    System.out.println(this.title + ", " + this.author + ", $" + this.price);
  }
  
  // a method that updates the price of this Book by halving it
  public void halfPrice(){
    this.price = this.price/2;
  }
  
  public String toString(){
   return "I'm here"; 
  }
                           
                           
  
  
    
  public static void main(String[] args){
    Book b1 = new Book("Inferno", "Dan Brown", 22.0);
    System.out.println(b1.title);
    System.out.println(b1.author);
    System.out.println(b1.price);
  }
}