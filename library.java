import java.util.HashMap;

public class Library {

  /* Using HashMap to indicate if a book (string) has been read (boolean). Methods include getting a list of book titles that have been read (true) and those that are unfinished (false). */

  // constructor
  public Library() {
  }

  // method to print books that have been read
  public void getFinishedBooks(HashMap<String, Boolean> library) {

    if (library.size() < 1) {
      System.out.println("Error. Your library has too few books.");
    } else {
      for ( String book : library.keySet() ) {
        if ( library.get(book) == true ) {
          System.out.println(book);
        }
      }
    }
  }

  // bonus method to print books that are unfinished
  public void unfinishedBooks(HashMap<String, Boolean> library) {

    if (library.size() < 1) {
      System.out.println("Error. Your library has too few books.");
    } else {
      for ( String book : library.keySet() ) {
        if ( library.get(book) == false ) {
          System.out.println("You haven't finished reading " + book);
        }
      }
    }
  }

  // main, which makes a myBooks HashMap
  public static void main(String[] args) {

    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
		myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);

    Library myLibrary = new Library();

    myLibrary.getFinishedBooks(myBooks);
    myLibrary.unfinishedBooks(myBooks);
  }

}
