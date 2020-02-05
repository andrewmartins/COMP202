import java.util.Arrays;
public class ExamGrading{
  public static void main(String[] args){
    char[][] responses = {{'C','A','B','B','C','A'},{'A','A','B','B','B','B'},{'C','B','A','B','C','A'},{'A','B','A','B','B','B'}};
    char[] solutions = {'C','A','B','B','C','C'};
    System.out.println(Arrays.toString(gradeAllStudents(responses, solutions)));
    System.out.println(Arrays.deepToString(findSimilarAnswers(responses, solutions,3)));
  }
  //Question 1: Exam Grading
  //The following method grades all the multiple choice responses received from students for an exam with provided solutions
  //the method produces an array of doubles of all the grades for the response at the corresponding index of an array of responses
  public static double[] gradeAllStudents(char[][] responses, char[] solutions){
    double perfect = solutions.length;
    double correctAnswers = 0;
    double grade = 0;
    double[] grades = new double[responses.length];
    for(int i=0;i<responses.length;i++){
      if(responses[i].length != solutions.length){
        i++;
        throw new IllegalArgumentException("The " + i + " student has " + responses[i].length + " responses and the number of questions on the exam is " + solutions.length);
      }
      else{
        int correctAnswersAtI = 0;
        for(int j=0;j<solutions.length;j++){
          if(responses[i][j]==solutions[j]){
            correctAnswersAtI += 1;
          }
        }
        correctAnswers = correctAnswersAtI;
        grade = (correctAnswers/perfect)*100;
      }
      grades[i] = grade;
    }
    return grades;
  }
  //Question 2:Cheating in Exams
  //the following methods are used to find similar wrong answers in an array of responses to an exam with solutions
  public static int numWrongSimilar(char[] responses1, char[] responses2, char[] solutions){
    int numOfSameWrongAnswers = 0;
    if(responses1.length != solutions.length || responses2.length != solutions.length || responses1.length != solutions.length){
        throw new IllegalArgumentException("The students have reponses that differ in length from each-other, or from the solutions");
      }
    else{
      for(int i=0;i<solutions.length;i++){
        if(responses1[i] == responses2[i]){
          if(responses1[i] != solutions[i]){
            numOfSameWrongAnswers++;
          }
        }
      }
    }
    return numOfSameWrongAnswers;
  }
  public static int numMatches(char[][] allResponses, char[] solutions, int studentAtI, int tooSimilar){
    int counter = 0;
    for(int i=0;i<allResponses.length;i++){
      if((i!=studentAtI)&&(numWrongSimilar(allResponses[i],allResponses[studentAtI],solutions)>=tooSimilar)){
        counter++;
      }
    }
    if(counter>0){
      return counter;
    }
    return 0;
  }
  public static int[][] findSimilarAnswers(char[][] responses, char[] solutions, int tooSimilar){
    int [][] similarAnswers = new int[responses.length][];
    for(int i=0;i<responses.length;i++){
      similarAnswers[i] = new int[numMatches(responses, solutions, i, tooSimilar)];
    }
    for(int i=0;i<similarAnswers.length;i++){
      for(int k=0;k<similarAnswers[i].length;k++){
        similarAnswers[i][k]=-1;
      }
    }
    for(int i=0;i<responses.length;i++){
      for(int j=0;j<responses.length;j++){
        if(i!=j){
          if(numWrongSimilar(responses[i],responses[j],solutions)>=tooSimilar){
            for(int k=0;k<similarAnswers[i].length;k++){
              if(similarAnswers[i][k]==-1){
                similarAnswers[i][k]=j;
                break;
              }
            }
          }
        }
      }
    }
    return similarAnswers;     
  }
}
