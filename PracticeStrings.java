public class PracticeStrings {
  public static void main(String[] args){
    // a method that takes a string S  and an int i as input
    // the method returns true if the character of s at index i is a vowel
    //false otherwise
    /*
     * isvowel ("Apple", 1) --> false
     * isVowel ("Apple", 4) --> true
     * isVowel ("Apple", 0) --> true
     */ 
    isVowel("Apple", 1);
    System.out.println(isVowel("Apple",1));
  }
  public static boolean isVowel(String s, int i){
    //converting the string in lowecase, selecting the character at index i, checking if it's a vowel
    char c = s.charAt(i);
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u'){
    }
    return false;
  }
}
                                         