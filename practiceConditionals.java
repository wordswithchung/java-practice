import java.util.*;

class ifDemo {


  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("\nPlease enter your age: ");
    int userAge = input.nextInt();

    if (userAge < 0 || userAge > 100) {
      System.out.println("Invalid age");
      System.out.println("Age must be between 0 and 100");
    } else if (userAge < 18) System.out.println("Sorry you are underage");
      else if (userAge < 21) System.out.println("You need parental consent");
      else {
      System.out.println("Congratulations!");
      System.out.println("You may sign up for the event!");
    }

    // Ternary Operator
    int myNum = 3>2 ? 10 : 5;
    System.out.println(myNum);

    System.out.println(21 > userAge ? "Younger than 21" : "Older than 21");

    // Switch Statement
    Scanner gradeIn = new Scanner(System.in);
    System.out.print("Enter your grade: ");
    String userGrade = gradeIn.nextLine().toUpperCase();

    switch (userGrade) {
      case "A+":
      case "A":
        System.out.println("Distinction");
        break;
      case "B":
        System.out.println("B Grade");
        break;
      case "C":
        System.out.println("C Grade");
        break;
      default:
        System.out.println("Fail");
        break;
    }

    Scanner dessertOrder = new Scanner(System.in);
    System.out.print("Enter in your dessert choice\n(1) Apple pie\n(2) Cherry pie\n(3) Watermelon slice: ");
    int order = dessertOrder.nextInt();

    switch (order) {
      case 1:
        System.out.println("Here's your delicious apple pie!");
        break;
      case 2:
        System.out.println("Your cherry pie has arrived!");
        break;
      case 3:
        System.out.println("Watermelon slice = yum yum yum");
        break;
      default:
        System.out.println("Since you can't decide, have a cookie");
        break;
    }


    // for statements schema:
    // for (initial value; test condition; modification to value) { do something }
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    // 0
    // 1
    // 2
    // 3
    // 4

    int[] arrayOfInts = {1, 8, 9, 2, -1, -33};
    int highestNumber = arrayOfInts[0];

    for (int j = 0; j < arrayOfInts.length; j++) {
      if (arrayOfInts[j] > highestNumber) highestNumber = arrayOfInts[j];
    }
    System.out.println("The highest number is " + highestNumber);


    // ENHANCED for statements schema:
    // for (variable declaration : name of array) { }
    int[] myNumbers = {10,20,30,40,50};
    for (int number : myNumbers) System.out.println(number);
    // 10
    // 20
    // 30
    // 40
    // 50

    String[] names = {"Anna","Beth","Chung","Dana","Eleanor"};
    for (String name : names) System.out.println("Her name is " + name);
    // Her name is Anna
    // Her name is Beth
    // Her name is Chung
    // Her name is Dana
    // Her name is Eleanor


    // WHILE STATEMENT schema:
    // while (condition is true { do a thing }
    int counter = 5;

    while (counter > 0) {
      System.out.println("Counter = " + counter);
      counter -= 1;
    }
    // Counter = 5
    // Counter = 4
    // Counter = 3
    // Counter = 2
    // Counter = 1


    // DO-WHILE statements are similar to while statements but one crucial difference:
    // the loop will run at least once before checking while condition
    int counter2 = 100;

    do {
      System.out.println("Counter2 = " + counter2);
      counter2++;
    } while (counter2<0);

    // BREAK: exits a loop prematurely when a certain condition is met
    for (int i = 0; i < 5; i++) {
      System.out.println("i = " + i);
      if (i == 2) break;
    }
    // i = 0
    // i = 1
    // i = 2


    // CONTINUE: the rest of the loop after the word is skipped for that iteration
    for (int i = 0; i < 5; i++) {
      System.out.println("i = " + i);
      if (i == 2) continue;
      System.out.println("I will not be printed if i = 2");
    }
    // i = 0
    // I will not be printed if i = 2
    // i = 1
    // I will not be printed if i = 2
    // i = 2
    // i = 3
    // I will not be printed if i = 2
    // i = 4
    // I will not be printed if i = 2

  }
}
