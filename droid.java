public class Droid {
  int batteryLevel;

  /* Droid class has (1) activate, (2) charge battery, (3) check battery, and (4) hovering methods. Battery life defaults at 100% to start with; actions done with the droid deplete or increase battery life. */

  // constructor; default battery level is 100 percent
  public Droid() {

    batteryLevel = 100;

  }

  /* activate method has message print out, battery level decreased by 5 percent, and print out of current battery level */
  public void activate() {

    System.out.println("Activated. How can I help you?");
    batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is: " + batteryLevel);

  }

  /* method to allow users to charge their droids */
  public void chargeBattery(int hours) {

    System.out.println("Droid is charging...");
    batteryLevel = batteryLevel + hours;

    if (batteryLevel > 100) {
      batteryLevel = 100;
    }

    System.out.println("Battery level is: " + batteryLevel);

  }

  // displays battery level
  public int checkBatteryLevel() {

    System.out.println("Battery level is: " + batteryLevel);
    return batteryLevel;
  }

  /* hovering option available under two feet only; decreases battery level by 20% */
  public void hover(int feet) {

    if (feet > 2) {
      System.out.println("Error! I cannot hover above 2 feet.");
    } else {
      System.out.println("Hovering...");
      batteryLevel = batteryLevel - 20;
      System.out.println("Battery level is: " + batteryLevel);
    }

  }

  //main method
  public static void main(String[] args) {

    Droid myDroid = new Droid();
    myDroid.activate();
    myDroid.chargeBattery(5);
    myDroid.hover(2);

  }

}
