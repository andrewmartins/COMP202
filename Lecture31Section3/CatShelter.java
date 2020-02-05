import java.util.Arrays;
public class CatShelter {
    // attributes
    private String name;
    private Cat[] cats;
    
    // constructors
    public CatShelter(String name) {
        this.name = name;
        // to avoid this.cats being initialized by default
        this.cats = new Cat[0];
    }
    
    public CatShelter(String name, Cat[] c) {
        this.name = name; 
        this.cats = new Cat[c.length];
        for(int i=0; i<c.length; i++) {
            this.cats[i] = c[i];
        }
    }
    
    // addCat that takes a Cat as input and adds it to the 
    // cats of this shelter
    public void addCat(Cat newCat) {
        // make space for the new cat
        // if(this.cats == null) ...
        Cat[] moreCats = new Cat[this.cats.length + 1];
        // copy the old cats in the new array
        for(int i=0; i<moreCats.length -1; i++) {
            moreCats[i] = this.cats[i];
        }
        moreCats[moreCats.length-1] = newCat;
        // update the attribute
        this.cats = moreCats;
    }
    
    public static void main(String[] args) {
        Cat c1 = new Cat("Foster", 4);
        Cat c2 = new Cat("George");
        Cat c3 = new Cat("Robert", 3);
        Cat c4 = new Cat("Grumpy", 8);
        Cat c5 = new Cat("Vodka", 2);
        
        Cat[] c = {c1, c2, c3, c4, c5};
        
        CatShelter s1 = new CatShelter("George's shelter",c);
        Cat myCat = new Cat("Spritz", 12);
        
        CatShelter s2 = new CatShelter("Balls of fur");
        s2.addCat(myCat);
        
        System.out.println(Arrays.toString(s2.cats));
    }
    
    
}
