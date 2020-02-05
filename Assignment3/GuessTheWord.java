//Fill in your name and student number
//Name: A. Martins
//Student Number: 260719278

// do NOT touch the following import statement
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
  
  private static final String[] words = {"perfect", "country", "pumpkin", "special", "freedom", "picture", "husband", 
    "monster", "seventy", "nothing", "sixteen", "morning", "journey", "history", "amazing", "dolphin", "teacher", 
    "forever", "kitchen", "holiday", "welcome", "diamond", "courage", "silence", "someone", "science", "revenge", 
    "harmony", "problem","awesome", "penguin", "youtube", "blanket", "musical", "thirteen", "princess", "assonant", 
    "thousand", "language", "chipotle", "business", "favorite", "elephant", "children", "birthday", "mountain", 
    "football", "kindness", "abdicate", "treasure", "strength", "together", "memories", "darkness", "sandwich", 
    "calendar", "marriage", "building", "function", "squirrel", "tomorrow", "champion", "sentence", "daughter", 
    "hospital", "identical", "chocolate", "beautiful", "happiness", "challenge", "celebrate", "adventure", 
    "important", "consonant", "dangerous", "irregular", "something", "knowledge", "pollution", "wrestling", 
    "pineapple", "adjective", "secretary", "ambulance", "alligator", "congruent", "community", "different", 
    "vegetable", "influence", "structure", "invisible", "wonderful", "nutrition", "crocodile", "education", 
    "beginning", "everything", "basketball", "weathering", "characters", "literature", "perfection", "volleyball", 
    "homecoming", "technology", "maleficent", "watermelon", "appreciate", "relaxation", "abominable", "government", 
    "strawberry", "retirement", "television", "silhouette", "friendship", "loneliness", "punishment", "university", 
    "confidence", "restaurant", "abstinence", "blackboard", "discipline", "helicopter", "generation", "skateboard", 
    "understand", "leadership", "revolution"};  
  
  // this method takes an integer as input and returns a radom String from the array above. 
  // you can use it, but do NOT modified neither the method NOR the above array. 
  public static String getRandomWord(int seed) {
    Random gen = new Random(seed);
    int randomIndex = gen.nextInt(words.length);
    return words[randomIndex];
  }
  
  //========================
  // Enter your code below
  public static void main(String[] args) {
    //the main method is used to simply input a random word in the play method.
    play(50);
    
  }
  //2a) this method will be used to test if the character inputted by the user is valid(a lower case letter of the English Alphabet)
  public static boolean isValidGuess(char c){
    if(c >= 'a' && c <= 'z'){
      return true;
    }
    else{
      return false;
    }
  }
  //2b) this method generates a new integer array of the same length of the randomly generated secret word, inputted in this method.
  public static int[] generateArrayOfGuesses(String secretWord){
    int[] arr = new int[secretWord.length()];
    return arr;
  }
  //2c) this method checks if the guess character inputted by the user, exists in the secret word, and updates the corresponding
  //array with a 1, to signify a correctly guessed character.
  public static boolean checkAndUpdate (String secretWord, int[] guesses, char guessChar){
    for(int i = 0;i<secretWord.length();i++){
      if(guessChar == secretWord.charAt(i)){
        guesses[i] = 1;
      }
    }
    for(int i = 0; i<guesses.length;i++){
      if(guessChar==secretWord.charAt(i)){
        return true;
      }
    }
    return false;
  }
  //2d) this method will display the guessed characters of the secret word and unknown characters as '-'. The previously
  //guessed characters prints lowercase, the last guessed character prints uppercase.
  public static String getWordToDisplay(String secretWord, int[] guesses, char guessChar){
    String guessWord = "";
    if(checkAndUpdate(secretWord, guesses, guessChar)){
      for(int i = 0;i<secretWord.length();i++){
        if(guessChar == secretWord.charAt(i)){
          guesses[i] = 2;
        }
      }
    }
    for(int i = 0;i<guesses.length;i++){
        if(guesses[i] == 0){
          guessWord += "-";
        }
        else if (guesses[i] == 1){
          guessWord += secretWord.charAt(i);
        }
        else if(guesses[i] == 2){
          guessWord += (char)(secretWord.charAt(i) - 32);
        }
      }
     for(int i = 0;i<secretWord.length();i++){
        if(guessChar == secretWord.charAt(i)){
          guesses[i] = 1;
        }
     }
    return guessWord; 
  }
  //2e) this method determines if the word is completely guessed correctly or not.
  public static boolean isWordGuessed(int[] guesses){
    int i = 0;
    while(i<guesses.length){
      while(guesses[i] == 0){
        return false;
      }
      i++;
    }
    return true;
  }
  //2f) this is the play method. it makes use of all the previous methods, interacts with the user using the Scanner method
  //and prints a statement depending on the input from the user in the interactions panel. This method will run the game, and determine if the 
  //user won or ran out of lives.
  public static void play(int i){
    String secretWord = getRandomWord(i);
    int[] guesses = generateArrayOfGuesses(secretWord);
    int lengthOfWord = guesses.length;
    Scanner read = new Scanner(System.in);
    System.out.println("Welcome to \"Guess the Word!\"");
    System.out.println("Your secret word has been generated. it has " + lengthOfWord + " characters. You have 10 lives. Good luck!");
    System.out.println();
    int numOfLives = 10;
        while(numOfLives>0){
            if(!isWordGuessed(guesses)){
              System.out.print("You have " + numOfLives + " lives left. Please enter a character: ");
              String guessString = read.nextLine();
              char guessChar = guessString.charAt(0);
              if(guessString.length() == 1){
                if(isValidGuess(guessChar)){
                  if(checkAndUpdate(secretWord, guesses, guessChar)){
                    System.out.println("Good job! The secret word contains the character " + guessChar);
                    System.out.println(getWordToDisplay(secretWord, guesses, guessChar));
                    System.out.println();
                  }     
                  else if(!checkAndUpdate(secretWord, guesses, guessChar)){
                    System.out.println("There's no such character. Try again!");
                    System.out.println(getWordToDisplay(secretWord, guesses, guessChar));
                    numOfLives--;
                  }
                }
                else if(guessChar <'a' || guessChar>'z'){
                  System.out.println("The character mus be a lower case letter of the English alphabet");
                }
              }
              else if(guessString.length()>1){
                System.out.println("You can only enter one single characer. Try again!");
                System.out.println();
            }
        }
            else if(isWordGuessed(guesses)){
                System.out.println("Congratualations you guessed the secret word!");
                read.close();
                break;
            }
        }
        if(numOfLives == 0){
          System.out.println("You have no lives left, better luck next time! The secret word was: " + secretWord);
          read.close();
        }
  }
}