import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Forest {

    private String name;
    public Tree[][] layout;

    public Forest(String name, int length, int sublength){
        this.name = name;
        layout = new Tree[length][sublength];
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int countTallSpecies(String species, double height){
        int count = 0;
        for (Tree[] innerArr : layout){
            count += countTallSpecies(species, height, innerArr);
        }
        return count;
    }

    private static int countTallSpecies(String species, double minHeight, Tree[] arr){
        int count = 0;
        for (Tree t : arr){

            if (t == null){
                continue;
            }

            if (t.getSpecies().equals(species) && t.getHeight() >= minHeight){
                count++;
            }
        }
        return count;
    }

    public static Forest loadForest(String fileName) throws IOException{

        Forest f = new Forest("Sherwood Forest", 5, 5);
        for (int i =0; i < 5; i++){

            for (int j = 0; j < 5; j++){
                if (i % 2 == 0){
                    f.layout[i][j] = new Tree("birch", i, i + j);
                }

            }
        }
        return f;
    }


    public static void writeDetails(String fileName, Forest myForest, String species, int nTrees, double minHeight) throws IOException{
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        String forestName = myForest.getName();
        bw.write(forestName + " has " + nTrees + " " + species + " trees that are at least " + minHeight + " meters tall.");
        bw.close();
    }
}