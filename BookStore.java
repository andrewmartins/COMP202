import java.util.Arrays;
public class BookStore{
  // a method that takes an array as input and displays info about all the elements
  public static void print(Book[] b){
    for(int i = 0; i<b.length;i++){
      // b[i] is an element of type array
      // is an object of type Book
      if(b[i] != null){
      b[i].print();
      }
    }
  }
// a method that takes an array of Books as input and cuts all the books' prices into half
  public static void sale(Book[] books){
    for(int i=0;i<books.length;i++){
      if(books[i] != null){
        books[i].halfPrice();
      }
    }
  }
  public static void main(String[] args){
    Book b1 = new Book("Inferno", "Dan Brown", 22.0);
    Book b2 = new Book("Giovanni's Room", "James Baldwin", 15.0);
    Book b3 = new Book("The Scarlet Letter", 21.0);
    /*
    b2.print();
    b2.halfPrice();
    b2.print();
    */
    // create an array of Books
    // Book[] books =  {b1, b2, b3};
    Book[] books = new Book[3];
    books[0] = b1;
    books[1] = b2;
    books[2] = b3;
    
    System.out.println(b2);
    //System.out.println(Arrays.deepToString(books));
    /*
    print(books);
    System.out.println();
    sale(books);
    print(books);
    */
    
  }
}
    