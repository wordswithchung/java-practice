import java.util.ArrayList;

public class GradeAnalyzer {

  /* This program takes a list of grades and returns the average grade for the array */

  // constructor
  public GradeAnalyzer() {
  }

  // method to get average
  public int getAverage(ArrayList<Integer> grades) {

    if (grades.size() < 1) {
      System.out.println("Error. Need larger sample size to return average");
      return 0;
    } else {
      int sum = 0;

      for (Integer grade : grades) {
        sum = sum + grade;
      }

      int average = sum / grades.size();
      System.out.println("The average grade is " + average);
      return average;
    }
  }

  // main
  // created myClassroom array
  // generated average grade
  public static void main(String[] args) {

    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);

  }
}
