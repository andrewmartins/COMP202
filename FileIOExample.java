import java.io.*;

public class FileIOExample {
    
    
    public static void main(String[] args) { 
        String[] fruits = {"banana", "passion fruit", "apple"};
        try{
            writeOnFile(fruits, "fruits.txt");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
        String[] moreFruit = {"orange", "strawberry"};
        try{
            writeOnFile(moreFruit, "fruits.txt");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }

    // a method that takes a String array as input as well as a filename (String)
    // the method write on the file all the elements of the array 
    // one per line
    public static void writeOnFile(String[] words, String filename) throws IOException{
        FileWriter fw = new FileWriter(filename, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0; i<words.length; i++) {
            bw.write(words[i]);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}