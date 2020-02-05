public class TestCat {
    
    
    public static void main(String[] args) { 
        Cat c1 = new Cat("Foster", 4);
        Cat c2 = new Cat("George");
        Cat c3 = new Cat("Robert", 3);
        Cat c4 = new Cat("Grumpy", 8);
        Cat c5 = new Cat("Vodka", 2);
        
        Cat[] c = {c1, c2, c3, c4, c5};
        
        System.out.println(c[Cat.findOldest(c)]);
    }
    
}
