public class Cat extends Animal{
  private String name;
  
  public void meow(){
    System.out.println("Meow!");
  }
  public void eat(){
   System.out.println("slurp"); 
  }
  public void eat(int n){
    
    for(int i=0;i<n;i++){
      System.out.print("slurp ");
    }
    System.out.println();
  }
  
  public static void main(String[] args){
    
    Animal a = new Animal();
    Cat c = new Cat();
    
    Animal a2 = new Cat();
    c.eat();
    ((Cat)a).eat(5);
  }
}