import java.util.Random;
import java.util.ArrayList;

public class Rando {

  public static Random randoo = new Random();
  public static Integer limit = 100;

  /**
   * This function does a random pair search.
   * Random path walking.
   */
  public static ArrayList<Integer> genNumSet() {
    // Blank array of integers to hold the eventual result
    ArrayList<Integer> result = new ArrayList<Integer>();
    // Gen the initial starting integer (so you only have to search for ONE other match)
    Integer x = randoo.nextInt(99);
    // $match is used to determine if, well, there's a match
    boolean match = false;

    // Once in a blue moon, the while loop is used
    while (!match) {
      // While theres NOT a match, generate a random integer (y)
      Integer y = randoo.nextInt(99);
      // If the intial int plus the new random int equals limit (100)
      // insert the initial int and the new random int into the result array
      // and set match equal to true so that we break out of the while loop
      if (x + y == limit) {
        result.add(x);
        result.add(y);
        match = true;
      }
    }

    // Return the result
    return result;
  }

  /**
   * Gen nums such that:
   * - x1 + x2 = first[0]
   * - y1 + y2 = first[1]
   * - x1 + y1 = second[0]
   * - x2 + y2 = second[1]
   * 
   * Random walk to find the right number combo
   * 
   * Well, i think this may be the best possible way to find a match.
   * It's completely random so your computer will love you and ask for more every time.
   * Oh, and your computer will feel like a genius when it finds a match.
   * So why should we deprive it of that happiness... we shouldn't. Run the program!
   */
   public static ArrayList<Integer> getDerivativeSets(ArrayList<Integer> set1, ArrayList<Integer> set2) {
    // Blank array of integers to hold the eventual result
    ArrayList<Integer> result = new ArrayList<Integer>();

    Integer x1 = randoo.nextInt(set1.get(0));
    Integer y1 = randoo.nextInt(set2.get(0));

    // $match is used to determine if, well, there's a match
    boolean match = false;

    // Once in a blue moon, the while loop is used
    while (!match) {
      // While theres NOT a match, generate a random integer (y)
      Integer x2 = randoo.nextInt(set1.get(1));
      Integer y2 = randoo.nextInt(set2.get(1));

      //! Uncomment this line to watch the fun!
      System.out.println(x1 + " - " + y1 + " - " + x2 + " - " + y2);

      // If the intial int plus the new random int equals limit (100)
      // insert the initial int and the new random int into the result array
      // and set match equal to true so that we break out of the while loop
      if (
        (x1 + x2 == set1.get(0)) && 
        (y1 + y2 == set1.get(1)) && 
        (x1 + y1 == set2.get(0)) && 
        (x2 + y2 == set2.get(1))
      ) {
        result.add(x1);
        result.add(x2);
        result.add(y1);
        result.add(y2);
        match = true;
      }
    }

    // Return the result
    return result;
   }

  public static void main(String[] args) {
    for (int i = 0; i < 1; i++) {
      ArrayList<Integer> first = genNumSet();
      ArrayList<Integer> second  = genNumSet();
      ArrayList<Integer> dir_set = getDerivativeSets(first, second);

      System.out.println(dir_set.get(0) + " + " + dir_set.get(1) + " = " + first.get(0));
      System.out.println(dir_set.get(2) + " + " + dir_set.get(3) + " = " + first.get(1));
      System.out.println(second.get(0) + " + " + second.get(1) + " = " + limit);

      // System.out.println(first.get(0));
      // System.out.println(first.get(1));
      // System.out.println(second.get(0) + " + " + second.get(1) + " = " + limit);
    }
  }
}
