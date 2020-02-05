public class CatShelter {
    // attributes
    private String name;
    private Cat[] cats;
    
    // constructors
    public CatShelter(String name) {
        this.name = name;
        // cats is null 
    }
    
    public CatShelter(String name, Cat[] c) {
        this.name = name; 
        this.cats = new Cat[c.length];
        for(int i=0; i<c.length; i++) {
            this.cats[i] = c[i];
        }
    }
    
}
