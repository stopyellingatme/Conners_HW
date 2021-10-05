import java.util.*;

public class Sampling {

  public static Random rando = new Random();

  /**
   * Generate a random list of numbers and it can repeat (0-10) Check if the
   * randomly generated number array contains all instances of the original array
   * (0-10)
   */
  public static boolean sampleRandomNumbers(Integer samp_size, Double variance) {
    boolean result = true;
    ArrayList<Integer> pick_list = new ArrayList<Integer>();
    // Blank array of integers to hold the randomly chosen list of numbers
    ArrayList<Integer> random_list = new ArrayList<Integer>();

    double bility = samp_size / variance;

    // Fill array with numbers (currently 0 - 10)
    for (int i = 0; samp_size > i; ++i) {
      pick_list.add(i);
    }

    // Generate a random list of numbers (any number and it can repeat)
    for (int i = 0; pick_list.size() > i; ++i) {
      Integer x = rando.nextInt(pick_list.size());
      random_list.add(x);
    }

    // Check each number in the list to see if it occurs in the random_list
    for (int i = 0; pick_list.size() > i; ++i) {
      if (random_list.contains(pick_list.get(i))) {
        result = false;
      }
    }

    double probability = proba(pick_list.size(), bility) * 100.0;
    long roundedProbability = Math.round(proba(pick_list.size(), bility) * 100.0);

    System.out.println("List of Numbers: " + pick_list);
    System.out.println("Random Numbers Chosen: " + random_list);
    System.out.println("Probability: " + probability);
    System.out.println("Rounded Probability: " + roundedProbability + "%");

    // Return the result
    return result;
  }

  /**
   * Function to call into normal distribution with
   * 
   * @param n number of items
   * @param p probability of item selection
   */
  public static double proba(double n, double p) {
    return phi((0.5 * n - p * n) / Math.sqrt(n * p * (1 - p)));
  }

  // Normal distribution formula
  private static double phi(double x) {
    return Math.exp(-(x * x) / 2) / Math.sqrt(2 * Math.PI);
  }

  public static void sample(Double variance, Integer size) {
    for (int i = 0; i < size; i++) {
      System.out.println("Was every number chosen? " + sampleRandomNumbers(i, variance) + "\n");
    }
  }

  public static void main(String[] args) {
    int sample = 20;
    sample((double)sample, sample);
  }
}
