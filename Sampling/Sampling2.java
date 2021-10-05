import java.util.*;

public class Sampling {

  public static Random rando = new Random();

  public static double mean(ArrayList<Double> values) {
    double mean = 0;
    for (double value : values)
      mean += value;
    return mean / values.size();
  }

  public static double variance(ArrayList<Double> values) {
    double mean = mean(values);
    double variance = 0;
    for (double value : values)
      variance += Math.pow(value - mean, 2);
    return variance / values.size();
  }

  public static double stdDev(ArrayList<Double> values) {
    return Math.sqrt(variance(values));
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

  /*********************************************************************************/
  /*********************************************************************************/
  /*********************************************************************************/

  /**
   * Generate a random list of numbers and it can repeat (0-10) Check if the
   * randomly generated number array contains all instances of the original array
   * (0-10)
   */
  public static boolean sampleRandomNumbers(Double samp_size) {
    boolean result = true;
    ArrayList<Double> pick_list = new ArrayList<Double>();
    // Blank array of Doubles to hold the randomly chosen list of numbers
    ArrayList<Double> random_list = new ArrayList<Double>();

    // double bility = samp_size / 11.0;

    // Fill array with numbers (currently 0 - 10)
    for (Double i = 0.0; samp_size > i; ++i) {
      pick_list.add(i);
    }

    // Generate a random list of numbers (any number and it can repeat)
    for (int i = 0; pick_list.size() > i; ++i) {
      Double x = rando.nextDouble();
      random_list.add(x);
    }

    // Check each number in the list to see if it occurs in the random_list
    for (int i = 0; pick_list.size() > i; ++i) {
      if (random_list.contains(pick_list.get(i))) {
        result = false;
      }
    }

    System.out.println("-- List of Numbers: " + pick_list);
    System.out.println("-- Random Numbers Chosen: " + random_list);
    // System.out.println("-- Probability: " + proba(pick_list.size(), bility));
    System.out.println("-- Probability: " + stdDev(pick_list));

    // Return the result
    return result;
  }

  public static void sample(Double loopNum) {
    for (Double i = 0.0; i < loopNum; i++) {
      System.out.println("Was every number chosen? " + sampleRandomNumbers(i) + "\n");
    }
  }

  /*********************************************************************************/
  /*********************************************************************************/
  /*********************************************************************************/

  public static void main(String[] args) {
    sample(11.0);
  }
}