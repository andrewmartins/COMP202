
public class Tree {

    private String species;
    private int age;
    private double height;

    public Tree(String species, int age, double height){

        if (age < 0 || height < 0){
            throw new IllegalArgumentException("Invalid values");
        }
        this.species = species;
        this.age = age;
        this.height = height;
    }

    public void birthday(){
        if (this.age == 0){
            this.height = 2 * this.height;
        }else{
            this.height = (this.height/this.age) + this.height;
        }
        this.age++;
    }

    public String getSpecies(){
        return this.species;
    }
    public double getHeight(){
        return this.height;
    }

}
