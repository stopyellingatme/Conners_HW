import java.util.*;

public class SelectList {

  public static Random randoo = new Random();
  public static ArrayList<Integer> pick_list = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

  /**
   * Generate a random list of numbers. Check if the randomly generated number
   * array contains all instances of the original array.
   */
  public static boolean pickRanomNums() {
    boolean result = true;
    // Blank array of integers to hold the randomly chosen list of numbers
    ArrayList<Integer> random_list = new ArrayList<Integer>();

    // Generate a random list of numbers
    for (int i = 0; pick_list.size() > i; ++i) {
      Integer x = randoo.nextInt(pick_list.size());
      random_list.add(x);
    }

    // Check each number in the list to see if it occurs in the random_list
    for (int i = 0; pick_list.size() > i; ++i) {
      if (random_list.contains(pick_list.get(i))) {
        result = false;
      }
    }

    System.out.println("List of Numbers: " + pick_list);
    System.out.println("Randomly Picked List: " + random_list);
    System.out.println("");

    // Return the result
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Was every number chosen? " + pickRanomNums());
  }
}
