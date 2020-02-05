import java.io.*;
import java.util.ArrayList;
public class FileIO{
  // a method used to create a new object of type Character by reading from a given file in the same
  // working directory
  public static Character readCharacter(String player){
    try{
      FileReader fr = new FileReader(player);
      BufferedReader br = new BufferedReader(fr);
      String line1 = br.readLine();
      double line2 = Double.parseDouble(br.readLine());
      double line3 = Double.parseDouble(br.readLine());
      int line4 = Integer.parseInt(br.readLine());
      Character character = new Character(line1,line2,line3,line4);
      br.close();
      fr.close();
      return character;
    }
    catch(FileNotFoundException e){
      System.out.println("Incorrect File Name");
      return null;
    }
    catch(IOException e){
      System.out.println("Problem reading this file");
      return null;
    }
  }
  // a method used to read a file containing information used for a Spell object
  // each line is read and partitioned correctly inorder to return the correct values for each attribute
  // the method returns an ArrayList containing all the information stored in the file, as spell objects
  public static ArrayList<Spell> readSpells(String filename){
    try{
      FileReader fr = new FileReader(filename);
      BufferedReader br = new BufferedReader(fr);
      ArrayList<Spell> spells = new ArrayList<Spell>();
      String spellInfo = br.readLine();
        while(spellInfo!=null){
          String[] spellInfoArr = spellInfo.split("\t");
          String name = spellInfoArr[0];
          double minDamage = Double.parseDouble(spellInfoArr[1]);
          double maxDamage = Double.parseDouble(spellInfoArr[2]);
          double chance = Double.parseDouble(spellInfoArr[3]);
          Spell spell = new Spell(name,minDamage,maxDamage,chance);
          spells.add(spell);
          spellInfo = br.readLine();
        }
        br.close();
        fr.close();
        return spells;
    }
    catch(FileNotFoundException e){
      System.out.println("Incorrect File Name!");
      return null;
    }
    catch(IOException e){
      System.out.println("Problem reading this file");
      return null;
    }
  }  
  // a method to write over a file with the name give as input string
  // this file contains the information stored in the input object of type Character
  public static void writeCharacter(Character character, String file){
    try{ 
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(character.getName());
      bw.newLine();
      bw.write("" + character.getAttackValue());
      bw.newLine();
      bw.write("" + character.getMaxHealth());
      bw.newLine();
      bw.write("" + character.getNumWins());
      bw.close();
      fw.close();
    }
    catch(IOException e){
      System.out.println("Problem creating this file");
    }
  }
}
  
