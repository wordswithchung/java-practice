class practiceStrings {

  // String methods documentation
  // http://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary
  
  public static void main(String[] args) {
    System.out.println("Length of this is.".length()); // 18
    System.out.println("Test test".toUpperCase()); // TEST TEST
    System.out.println("YOU SHOULDN'T YELL!!!".toLowerCase()); // you shouldn't yell!!!

    String test = "This is a long string";
    String is = test.substring(5, 7);
    System.out.println(is); // is
    String a = test.substring(8, 9);
    System.out.println(a); // a
    System.out.println(test.substring(10)); // long string

    // charAt()
    char rando_5 = test.charAt(5);
    System.out.println(rando_5); // i

    // equals()
    String one = "abc";
    String two = "abc";
    String three = "def";
    System.out.println(one.equals(two)); // true
    System.out.println(one.equals(three)); // false
    System.out.println(one.equals("abc")); // true

    // split() argument is delimiter, returns array
    String names = "Anna, Becca, Courtney";
    String[] namesSplit = names.split(",");
    System.out.println(namesSplit[0].trim()); // Anna

    String concatter = names.concat(" More things");
    System.out.println(concatter); // Anna, Becca, Courtney More things

    System.out.println(names.hashCode()); // -8993195

    System.out.println(names.replace("Anna", "Cupcake")); // Cupcake, Becca, Courtney
    System.out.println(names); // Anna, Becca, Courtney
  }
}
