import java.util.arrays;

class Solution {

  // Arrays
  // http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

  public static void main(String[] args) {

    // two ways to declare arrays
    int[] userAge; // preferred declaration method
    int userAges[];

    // initialize the array
    userAge = new int[] {1, 2, 3, 4, 5};

    // declare and initialize one one go, option one
    int[] userAge1 = new int[] {8, 15, 29, 31, 49};
    // declare and initialize, option two
    int[] userAge2 = {39, 19, 38, 17, 3};
    // declare and initialize, option three
    int[] userAge3 = new int[5]; // {0, 0, 0, 0, 0}
    System.out.println(userAge3[0]);
    userAge3[0] = 15; //{15, 0, 0, 0, 0}
    System.out.println(userAge3[0]);

    int[] arr1 = {0,2,4,6};
    int[] arr2 = {0,2,4,6};
    int[] arr3 = {6,4,2,0};

    System.out.println(Arrays.equals(arr1, arr2)); // true
    System.out.println(Arrays.equals(arr2, arr3)); // false

    int[] source = {12,1,5,-2,16,14,18,20,25};
    int[] dest = Arrays.copyOfRange(source, 3, 7);
    System.out.println(Arrays.toString(dest)); // [-2, 16, 14, 18]
    
    System.out.println(Arrays.toString(source)); // [12, 1, 5, -2, 16, 14, 18, 20, 25]
    Arrays.sort(source);
    System.out.println(Arrays.toString(source)); // [-2, 1, 5, 12, 14, 16, 18, 20, 25]

    int foundIndex = Arrays.binarySearch(source, 16);
    System.out.println(foundIndex); // 5
    int notFound = Arrays.binarySearch(source, 17);
    System.out.println(notFound); // -7 ... the index it should be at is 6

    System.out.println(source.length); // 9
  }
}
