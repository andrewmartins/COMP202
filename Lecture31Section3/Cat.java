import java.util.Arrays;
public class Cat {
    // attributes
    private String name;
    private int age;
    private static int numOfCats; 
    
    // constructors
    public Cat(String name) {
        this.name = name;
        this.age = 0;
        Cat.numOfCats++;
    }
    
    public Cat(String n, int a) {
        this.name = n;
        this.age = a;
        numOfCats++;
    }
    
    
    // other methods
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public static int getNumOfCats() {
        return numOfCats;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public String toString() {
        return this.name + " is " + this.age + " years old";
    }
    
    // a method that takes a Cat as input and returns true if this cat
    // is older than the input Cat, false otherwise
    public boolean isOlderThan(Cat c) {
        if(this.age > c.age) {
            return true;
        }
        return false;
    }
    
    // a method that takes two cats as input and returns the oldest of the two
    public static Cat findOldest(Cat c1, Cat c2) {
        if(c1.age > c2.age) {
            return c1;
        } else {
            return c2;
        }
    }
    
    public static int findOldest(Cat[] cats) {
        int oldestPos = 0; 
        Cat oldest = cats[oldestPos];
        for(int i=1; i<cats.length; i++) {
            if(cats[i].age > oldest.age) {
                // update guess
                oldestPos = i;
                oldest = cats[i];
            }
        }
        return oldestPos;
    }
    
    
    public static void main(String[] args) {
        Cat c1 = new Cat("Foster", 4);
        Cat c2 = new Cat("George");
        Cat c3 = new Cat("Robert", 3);
        Cat c4 = new Cat("Grumpy", 8);
        Cat c5 = new Cat("Vodka", 2);
        
        Cat[] c = {c1, c2, c3, c4, c5};
        
        System.out.println(c[findOldest(c)]);
    }
    
}
