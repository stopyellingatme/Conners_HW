import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultipleChoice {

  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Store 50 states and their capitals in a two-dimensional array
    String[][] states = getData();

    // Get state and capital
    int ansIndex = rando();
    String state = states[ansIndex][0];
    String cap = states[ansIndex][1];

    // Get some other capital cities
    String notCap01 = states[rando()][1];
    String notCap02 = states[rando()][1];
    String notCap03 = states[rando()][1];

    // Add capitals to string array so we can capture a number
    // for user input instead of them typing in the actual capital name.
    String[] choices = new String[] {
      (ansIndex > 25 ? cap : notCap01),
      (ansIndex > 25 ? notCap01 : notCap02),
      (ansIndex > 25 ? notCap02 : notCap03),
      (ansIndex > 25 ? notCap03 : cap),
    };
    // Ask user what the capital of the given state (1, 2, 3 or 4)
    // Note: \n means new line (stems from return carrage on old typewriters)
    System.out.print(
      "What is the capital of " +
      state +
      "?\n" +
      "1 - " +
      choices[0] +
      "\n" +
      "2 - " +
      choices[1] +
      "\n" +
      "3 - " +
      choices[2] +
      "\n" +
      "4 - " +
      choices[3] +
      "\n"
    );
    // Get user's answer and parse the input as an integer so we can match it
    // to the choices string array
    String answer = choices[Integer.parseInt(input.nextLine()) - 1];

    // Check if the answer is correct.
    if (isEqual(cap, answer)) {
      System.out.println("Your answer is correct! Good Job! Woohoo!");
      input.close();
      return;
    } else {
      System.out.println("NOPE! GET OUTA HERE! WRONG ANSWER!");
    }

    // Display the correct capital
    System.out.println("\nThe correct answer is: " + cap);
    input.close();
    return;
  }

  /** isEqual returns true if a is equal to c */
  public static boolean isEqual(String c, String a) {
    if (c.length() != a.length()) return false;

    for (int i = 0; i < c.length(); i++) {
      if (c.charAt(i) != a.charAt(i)) return false;
    }

    return true;
  }

  public static int rando() {
    int randomNum = ThreadLocalRandom.current().nextInt(0, 51);
    return randomNum;
  }

  /** getData initializes the array with the 50 states and their capitals */
  public static String[][] getData() {
    String[][] d = {
      { "Alabama", "Montgomery" },
      { "Alaska", "Juneau" },
      { "Arizona", "Phoenix" },
      { "Arkansas", "Little Rock" },
      { "California", "Sacramento" },
      { "Colorado", "Denver" },
      { "Connecticut", "Hartford" },
      { "Delaware", "Dover" },
      { "Florida", "Tallahassee" },
      { "Georgia", "Atlanta" },
      { "Hawaii", "Honolulu" },
      { "Idaho", "Boise" },
      { "Illinois", "Springfield" },
      { "Indiana", "Indianapolis" },
      { "Iowa Des", "Moines" },
      { "Kansas", "Topeka" },
      { "Kentucky", "Frankfort" },
      { "Louisiana", "Baton Rouge" },
      { "Maine", "Augusta" },
      { "Maryland", "Annapolis" },
      { "Massachusetts", "Boston" },
      { "Michigan", "Lansing" },
      { "Minnesota", "Saint Paul" },
      { "Mississippi", "Jackson" },
      { "Missouri", "Jefferson City" },
      { "Montana", "Helena" },
      { "Nebraska", "Lincoln" },
      { "Nevada    ", "Carson City" },
      { "New Hampshire", "Concord" },
      { "New Jersey", "Trenton" },
      { "New Mexico", "Santa Fe" },
      { "New York", "Albany" },
      { "North Carolina", "Raleigh" },
      { "North Dakota", "Bismarck" },
      { "Ohio", "Columbus" },
      { "Oklahoma", "Oklahoma City" },
      { "Oregon", "Salem" },
      { "Pennsylvania", "Harrisburg" },
      { "Rhode Island", "Providence" },
      { "South Carolina", "Columbia" },
      { "South Dakota", "Pierre" },
      { "Tennessee", "Nashville" },
      { "Texas", "Austin" },
      { "Utah", "Salt Lake City" },
      { "Vermont", "Montpelier" },
      { "Virginia", "Richmond" },
      { "Washington", "Olympia" },
      { "West Virginia", "Charleston" },
      { "Wisconsin", "Madison" },
      { "Wyoming", "Cheyenne" },
    };
    return d;
  }
}
