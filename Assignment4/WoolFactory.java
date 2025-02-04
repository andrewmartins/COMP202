import java.util.Scanner;
import java.util.Random;
public class WoolFactory{
  //The provided code generates random ages for sheep, and picks random names from the below array
  //You can modify this list of names as you wish (add/remove/replace elements).
  private static String[] namesForSheep = {"Cerdic","Cynric","Ceawlin","Ceol","Ceolwulf","Cynegils",
    "Cenwalh","Seaxburh","Aescwine","Centwine","Ceadwalla","Ine","Aethelheard","Cuthred","Cynewulf",
    "Berhtric","Egbert","Aethelwulf","Aethelbald","Aethelberht","Aethelred","Hengest","Aesc","Octa",
    "Eormenric","Aethelbert I","Eadbald","Earconbert","Egbert I","Hlothere","Oswine","Wihtred",
    "Aethelbert II","Sigered","Egbert II","Eadberht II","Cuthred","Baldred","Aethelfrith","Edwin","St. Oswald",
    "Oswiu","Ecgfrith","Aldfrith","Osred I","Cenred","Osric","Ceolwulf","Eadberht",
    "Aethelwald","Alhred","Aethelred I","Aelfwald I","Eardwulf","Eanred","George V","Edward VIII",
    "George VI","Elizabeth II"};
  private static Random r = new Random(123);
  
  //returns a random String from the above array. 
  private static String getRandomName(){
    int index = r.nextInt(namesForSheep.length);
    return namesForSheep[index];
  }
  //returns a random age for a sheep from 1 to 10
  private static int getRandomAge(){
    return r.nextInt(10)+1;
  }
  //End of provided name/age generation code. 
  
  public static void main(String[] args){
    //Student Name: A.Martins
    //Student Number: 260719278
    //Your code goes here.
    // interaction of user with the scanner
    Scanner read = new Scanner(System.in);
    System.out.println("What is the name of your farm?");
    String farmName = read.nextLine();
    System.out.println("What is the name of your dog?");
    String dogName = read.nextLine();
    System.out.println("What kind of dog is " + dogName + "?");
    String dogBreed = read.nextLine();
    System.out.println("And how many sheep do you have?");
    int numOfSheep = read.nextInt();
    read.close();
    System.out.println("The farm has " + numOfSheep + " sheep.");
    System.out.println("Farm: " + farmName + " Dog: " + dogName);
    //creating objects of type Dog, Sheep, Sheep[], and Farm
    Dog dog = new Dog(dogName,dogBreed);
    Sheep[] sheep = new Sheep[numOfSheep];
    for(int i=0;i<numOfSheep;i++){
    sheep[i] = new Sheep(getRandomName(),getRandomAge());
    }
    Farm farm = new Farm(farmName,dog,sheep);
    farm.printFarm();
    double totalWool = farm.getWool();
    double profit = 1.45*totalWool;
    System.out.println("We just sheared " + totalWool + " lbs. of wool for a value of $" + profit);
    
    
    
  }
  
}
